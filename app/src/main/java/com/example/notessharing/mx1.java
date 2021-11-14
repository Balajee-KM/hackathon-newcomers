package com.example.notessharing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mx1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mx1);

        Button physics = findViewById(R.id.Physics);
        Button chemistry = findViewById(R.id.chemistry);
        Button maths = findViewById(R.id.maths);

        physics.setOnClickListener(this);
        chemistry.setOnClickListener(this);
        maths.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Physics:
                Intent intent = new Intent(mx1.this, physics.class);
                startActivity(intent);
                break;

            case R.id.chemistry:
                Intent intent2 = new Intent(mx1.this, chemistry.class);
                startActivity(intent2);
                break;

            case R.id.maths:
                Intent intent3 = new Intent(mx1.this, maths.class);
                startActivity(intent3);
                break;
        }
    }
}