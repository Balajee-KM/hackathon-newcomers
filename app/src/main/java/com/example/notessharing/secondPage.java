package com.example.notessharing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class secondPage extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);



        Button MX = findViewById(R.id.sub1);
        Button RAE = findViewById(R.id.sub2);
        Button CSE = findViewById(R.id.sub3);


        MX.setOnClickListener(this);
        RAE.setOnClickListener(this);
        CSE.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sub1:
            Intent intent=new Intent(secondPage.this,mx.class);
            startActivity(intent);
                break;

            case R.id.sub2:
                Intent intent2=new Intent(secondPage.this,RAE.class);
                startActivity(intent2);
                break;

            case R.id.sub3:
                Intent intent3=new Intent(secondPage.this,CSE.class);
                startActivity(intent3);
                break;
        }

    }
}



