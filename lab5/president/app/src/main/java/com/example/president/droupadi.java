package com.example.president;

import android.os.Bundle;
import android.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class droupadi extends Fragment {

    View view;
    TextView textView,textView2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_droupadi, container, false);
        textView = view.findViewById(R.id.textView);
        textView2 = view.findViewById(R.id.textView2);
        textView.setText("        Droupadi Murmu \n  25 July 2022 – PRESENT");
        textView2.setText("-Ninth Governor of Jharkhand in May 2015\n-Nominated by the Bharatiya Janata Party (BJP) " +
                "-Presidency of India in the 2022 elections.");
        return view;
    }
}



