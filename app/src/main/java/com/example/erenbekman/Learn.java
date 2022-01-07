package com.example.erenbekman;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Learn extends AppCompatActivity {

    Button lvl1, lvl2, lvl3;
    ImageView nextpage4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        info();

        lvl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();
            }
        });
        lvl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity2();
            }
        });
        lvl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity3();
            }
        });
        nextpage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity4();
            }
        });
    }
    public void info(){
        lvl1 = (Button) findViewById(R.id.lvl1);
        lvl2 = (Button) findViewById(R.id.lvl2);
        lvl3 = (Button) findViewById(R.id.lvl3);
        nextpage4 = (ImageView) findViewById(R.id.nextpage4);
    }
    public void changeActivity(){
        Intent i = new Intent(Learn.this, Lvl1.class);
        startActivity(i);
    }
    public void changeActivity2(){
        Intent i = new Intent(Learn.this, Lvl2.class);
        startActivity(i);
    }
    public void changeActivity3(){
        Intent i = new Intent(Learn.this, Lvl3.class);
        startActivity(i);
    }
    public void changeActivity4(){
        Intent i = new Intent(Learn.this, MainActivity.class);
        startActivity(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.one){
            Intent i = new Intent(Learn.this,MainActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}