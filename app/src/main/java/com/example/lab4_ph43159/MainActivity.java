package com.example.lab4_ph43159;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bai1).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, bai1.class);
            startActivity(intent);
        });
        findViewById(R.id.bai2).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, bai2.class);
            startActivity(intent);
        });
        findViewById(R.id.bai3).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, bai_3.class);
            startActivity(intent);
        });
    }
}