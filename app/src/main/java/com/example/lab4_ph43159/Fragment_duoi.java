package com.example.lab4_ph43159;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment_duoi extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_duoi, container, false);
        EditText editText = view.findViewById(R.id.edtnuaduoi);
        view.findViewById(R.id.btnsend).setOnClickListener(v -> {
            String data = editText.getText().toString();
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentText2 fragmentText2 = (FragmentText2) fragmentManager.findFragmentById(R.id.fragmenttren);
            fragmentText2.textView.setText(data);
        });
        return view;
    }
}