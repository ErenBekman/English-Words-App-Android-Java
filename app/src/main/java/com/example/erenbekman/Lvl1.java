package com.example.erenbekman;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;



public class Lvl1 extends AppCompatActivity {
    TextView allWords;
    TextView learn;
    ImageView nextpage;
    private VTContact db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1);
        info();
        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();
            }
        });

        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                learnWords();
            }
        });

    }
    public void info(){
        allWords = (TextView) findViewById(R.id.allWords);
        learn = (TextView) findViewById(R.id.learn);
        nextpage = (ImageView) findViewById(R.id.nextpage);
        db = new VTContact(this);
    }

    public void learnWords(){
        String [] sutun = {"ingWord","trWord"};
        String all = "";
        SQLiteDatabase SQLdb = db.getReadableDatabase();

        Cursor lvlOne = SQLdb.query("lvlOne",sutun,null,null,null,null,null);
        while (lvlOne.moveToNext()){
            @SuppressLint("Range") String ing = lvlOne.getString(lvlOne.getColumnIndex("ingWord"));
            @SuppressLint("Range") String tr = lvlOne.getString(lvlOne.getColumnIndex("trWord"));
            all += ing + "     :     " + tr + "\n";
        }
        allWords.setText(all);
        lvlOne.close();
    }

    public void changeActivity(){
        Intent i = new Intent(Lvl1.this,Learn.class);
        startActivity(i);
    }
}