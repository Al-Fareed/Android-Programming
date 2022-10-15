package com.example.president;

import android.os.Bundle;
import android.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class pranam extends Fragment {

    View view;
    TextView textView,textView2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_pranam, container, false);
        textView = view.findViewById(R.id.textView);
        textView2 = view.findViewById(R.id.textView2);
        textView.setText("        Pranab Mukherjee \n  25 July 2012 – 25 July 2017");
        textView2.setText( "-Chairman and president of the Rabindra Bharati University\n"+
                "-Trustee of the Bangiya Sahitya Parishad and Bidhan Memorial Trust.");
        return view;
    }
}



