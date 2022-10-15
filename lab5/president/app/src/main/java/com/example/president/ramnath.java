package com.example.president;

import android.os.Bundle;
import android.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ramnath extends Fragment {

    View view;
    TextView textView,textView2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_ramnath, container, false);
        textView = view.findViewById(R.id.textView);
        textView2 = view.findViewById(R.id.textView2);
        textView.setText("        Ram Nath Kovind\n  25 July 2017 – 25 July 2022");
        textView2.setText("-26th Governor of Bihar from 2015 to 2017 \n-Member of Parliament, Rajya Sabha from 1994 to 2006 \n" +
                "-Lawyer for 16 years  until 1993.");
        return view;
    }
}



