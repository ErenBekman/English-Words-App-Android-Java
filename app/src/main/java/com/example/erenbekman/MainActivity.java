package com.example.erenbekman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnlearn,btnrepeat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info();


        btnlearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();
            }
        });
        btnrepeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity2();
            }
        });
    }
    public void info() {
        btnlearn = (Button)findViewById(R.id.btnlearn);
        btnrepeat = (Button)findViewById(R.id.btnrepeat);
    }
    public void changeActivity(){
        Intent i = new Intent(MainActivity.this, Learn.class);
        startActivity(i);
    }
    public void changeActivity2(){
        Intent i = new Intent(MainActivity.this, Repeat.class);
        startActivity(i);
    }


}