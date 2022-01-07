package com.example.erenbekman;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collections;

public class Repeat extends AppCompatActivity {
    public static ArrayList<Words> listQuestion;
    Words words;
    int index=0;
    TextView question,O1,O2,O3,O4;
    CardView CardO1,CardO2,CardO3,CardO4;
    LinearLayout nextQuestion;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repeat);
        listQuestion = new ArrayList<>();
        listQuestion.add(new Words("Engineer","Polis","Mühendis","Bankacı","Öğretmen","Mühendis"));
        listQuestion.add(new Words("Habit","Haber","Sağlık","Alışkanlık","Harita","Alışkanlık"));
        listQuestion.add(new Words("Adventure","Taşımak","Pilot","Kaza","Macera","Macera"));
        listQuestion.add(new Words("Confused","Kafası karışık","Temas","Toplamak","Kumaş","Kafası karışık"));
        listQuestion.add(new Words("Nervous","Zararlı","Ay","Yaramaz","Sinirli","Sinirli"));
        listQuestion.add(new Words("Advertisement","Başvuru","Reklam","Endişeli","Şefkat","Reklam"));


//        databaseReference = FirebaseDatabase.getInstance().getReference("Question");
//        databaseReference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                for (DataSnapshot dataSnapshot:snapshot.getChildren()){
//                    Words words=dataSnapshot.getValue(Words.class);
//                    listQuestion.add(words);
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });

        Collections.shuffle(listQuestion);
        words = listQuestion.get(index);
        info();
        setAllData();

    }

    public void info(){
        question = (TextView) findViewById(R.id.question);
        O1 = (TextView) findViewById(R.id.O1);
        O2 = (TextView) findViewById(R.id.O2);
        O3 = (TextView) findViewById(R.id.O3);
        O4 = (TextView) findViewById(R.id.O4);
        CardO1 = (CardView) findViewById(R.id.CardO1);
        CardO2 = (CardView) findViewById(R.id.CardO2);
        CardO3 = (CardView) findViewById(R.id.CardO3);
        CardO4 = (CardView) findViewById(R.id.CardO4);
        nextQuestion = (LinearLayout) findViewById(R.id.nextQuestion);
    }
    public void setAllData(){
        question.setText(words.getQuestion());
        O1.setText(words.getO1());
        O2.setText(words.getO2());
        O3.setText(words.getO3());
        O4.setText(words.getO4());
    }
    public void CorrectQuestion(CardView cardview){
        cardview.setBackgroundColor(getResources().getColor(R.color.green));
        nextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                index++;
                words = listQuestion.get(index);
                setAllData();
                resetColor();
            }
        });
    }
    public void WrongQuestion(CardView cardO1){
        cardO1.setBackgroundColor(getResources().getColor(R.color.red));

        nextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(index<listQuestion.size()-1){
                    index++;
                    words = listQuestion.get(index);
                    setAllData();
                    resetColor();
                }else{
                    WordWrong();
                }
            }
        });

    }
    private void WordWrong(){
        Intent i = new Intent(Repeat.this,MainActivity.class);
        startActivity(i);
    }

    public void resetColor(){
        CardO1.setBackgroundColor(getResources().getColor(R.color.white));
        CardO2.setBackgroundColor(getResources().getColor(R.color.white));
        CardO3.setBackgroundColor(getResources().getColor(R.color.white));
        CardO4.setBackgroundColor(getResources().getColor(R.color.white));
    }

    public void CardO1Click(View view){
        if(words.getO1().equals(words.getAns())){
            CardO1.setBackgroundColor(getResources().getColor(R.color.green));
            if(index < listQuestion.size() - 1){
//                index++;
//                words = listQuestion.get(index);
//                setAllData();
//                resetColor();
                CorrectQuestion(CardO1);
            }else{
                WordWrong();
            }
        }else{
            WrongQuestion(CardO1);
        }
    }

    public void CardO2Click(View view){
        if(words.getO2().equals(words.getAns())){
            CardO2.setBackgroundColor(getResources().getColor(R.color.green));
            if(index < listQuestion.size() - 1){
//                index++;
//                words = listQuestion.get(index);
//                setAllData();
//                resetColor();
                CorrectQuestion(CardO2);
            }else{
                WordWrong();
            }
        }else{
            WrongQuestion(CardO2);
        }
    }

    public void CardO3Click(View view){
        if(words.getO3().equals(words.getAns())){
            CardO3.setBackgroundColor(getResources().getColor(R.color.green));
            if(index < listQuestion.size() - 1){
//                index++;
//                words = listQuestion.get(index);
//                setAllData();
//                resetColor();
                CorrectQuestion(CardO3);
            }else{
                WordWrong();
            }
        }else{
            WrongQuestion(CardO3);
        }
    }

    public void CardO4Click(View view){
        if(words.getO4().equals(words.getAns())){
            CardO4.setBackgroundColor(getResources().getColor(R.color.green));
            if(index < listQuestion.size() - 1){
//                index++;
//                words = listQuestion.get(index);
//                setAllData();
//                resetColor();
                CorrectQuestion(CardO4);
            }else{
                WordWrong();
            }
        }else{
            WrongQuestion(CardO4);
        }
    }
}