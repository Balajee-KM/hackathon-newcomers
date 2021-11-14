package com.example.notessharing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mx extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mx);

        Button first = findViewById(R.id.first);
        Button second = findViewById(R.id.second);
        Button third = findViewById(R.id.third);

        first.setOnClickListener(this);
        second.setOnClickListener(this);
        third.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.first:
                Intent intent = new Intent(mx.this, mx1.class);
                startActivity(intent);
                break;

            case R.id.second:
                Intent intent2 = new Intent(mx.this, mx2.class);
                startActivity(intent2);
                break;

            case R.id.third:
                Intent intent3 = new Intent(mx.this, mx3.class);
                startActivity(intent3);
                break;


        }
    }
}