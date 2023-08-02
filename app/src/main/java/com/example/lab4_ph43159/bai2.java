package com.example.lab4_ph43159;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class bai2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        FragmentText2 fragmentText2 = new FragmentText2();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragmenttren, fragmentText2).commit();

        Fragment_duoi fragment_duoi = new Fragment_duoi();
        FragmentManager fragmentManager1 = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragmentduoi, fragment_duoi).commit();
    }
}