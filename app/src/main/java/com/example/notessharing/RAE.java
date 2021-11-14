package com.example.notessharing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RAE extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rae);

        Button first = findViewById(R.id.first);
        Button second = findViewById(R.id.second);
        Button third = findViewById(R.id.third);
        Button fourth =findViewById(R.id.fourth);

        first.setOnClickListener(this);
        second.setOnClickListener(this);
        third.setOnClickListener(this);
        fourth.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.first:
                Intent intent = new Intent(RAE.this, rae1.class);
                startActivity(intent);
                break;

            case R.id.second:
                Intent intent2 = new Intent(RAE.this, cse2.class);
                startActivity(intent2);
                break;

            case R.id.third:
                Intent intent3 = new Intent(RAE.this, rae31.class);
                startActivity(intent3);
                break;



        }
    }
}