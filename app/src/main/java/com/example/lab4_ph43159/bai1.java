package com.example.lab4_ph43159;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Button;

public class bai1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        Button btnfragment1 = findViewById(R.id.btnfragment1);
        Button btnfragment2 = findViewById(R.id.btnfragment2);

        btnfragment1.setOnClickListener(v -> {
            FragmentImage fragmentImage = new FragmentImage();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.container, fragmentImage).commit();
        });

        btnfragment2.setOnClickListener(v -> {
            FragmentText fragmentText = new FragmentText();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.container, fragmentText).commit();
        });
    }
}