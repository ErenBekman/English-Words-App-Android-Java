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

public class Lvl2 extends AppCompatActivity {
    TextView allWords2, learn2;
    ImageView nextpage2;
    private VTContact2 db2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl2);
        info();
        learn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                learnWords2();
            }
        });
        nextpage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();
            }
        });
    }
    public void info(){
        allWords2 = (TextView) findViewById(R.id.allWords2);
        learn2 = (TextView)findViewById(R.id.learn2);
        nextpage2 = (ImageView)findViewById(R.id.nextpage2);
        db2 = new VTContact2(this);
    }

    public void learnWords2(){
        String [] sutun = {"ingWord","trWord"};
        String all = "";
        SQLiteDatabase SQLdb = db2.getReadableDatabase();
        Cursor lvlTwo = SQLdb.query("lvlTwo",sutun,null,null,null,null,null);
        while (lvlTwo.moveToNext()){
            @SuppressLint("Range") String ing = lvlTwo.getString(lvlTwo.getColumnIndex("ingWord"));
            @SuppressLint("Range") String tr = lvlTwo.getString(lvlTwo.getColumnIndex("trWord"));
            all += ing + "     :     " + tr + "\n";
        }
        allWords2.setText(all);
        lvlTwo.close();
    }
    public void changeActivity(){
        Intent i = new Intent(Lvl2.this,Learn.class);
        startActivity(i);
    }
}