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

public class Lvl3 extends AppCompatActivity {
    TextView allWords3,learn3;
    ImageView nextpage3;
    private VTContact3 db3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl3);
        info();
        learn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                learnWords3();
            }
        });

        nextpage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();
            }
        });
    }
    public void info(){
        allWords3 = (TextView) findViewById(R.id.allWords3);
        learn3 = (TextView)findViewById(R.id.learn3);
        nextpage3 = (ImageView)findViewById(R.id.nextpage3);
        db3 = new VTContact3(this);
    }

    public void learnWords3(){
        String [] sutun = {"ingWord","trWord"};
        String all = "";
        SQLiteDatabase SQLdb = db3.getReadableDatabase();
        Cursor lvlThree = SQLdb.query("lvlThree",sutun,null,null,null,null,null);
        while (lvlThree.moveToNext()){
            @SuppressLint("Range") String ing = lvlThree.getString(lvlThree.getColumnIndex("ingWord"));
            @SuppressLint("Range") String tr = lvlThree.getString(lvlThree.getColumnIndex("trWord"));
            all += ing + "     :     " + tr + "\n";
        }
        allWords3.setText(all);
        lvlThree.close();
    }
    public void changeActivity(){
        Intent i = new Intent(Lvl3.this,Learn.class);
        startActivity(i);
    }
}