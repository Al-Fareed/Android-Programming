package com.example.president;

import android.os.Bundle;
import android.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class abdulKalam extends Fragment {

    View view;
    TextView textView,textView2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_abdul_kalam, container, false);
        textView = view.findViewById(R.id.textView);
        textView2 = view.findViewById(R.id.textView2);
        textView.setText("        A. P. J. Abdul Kalam \n  25 July 2002 – 25 July 2007");
        textView2.setText("-1981: Padma Bhushan – Government of India\n" +
                "-1990: Padma Vibhushan – Government of India\n" +
                "-1997: Bharat Ratna – Government of India");
        return view;
    }
}



