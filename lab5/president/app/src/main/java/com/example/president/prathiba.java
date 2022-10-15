package com.example.president;

import android.os.Bundle;
import android.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class prathiba extends Fragment {

    View view;
    TextView textView,textView2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_prathiba, container, false);
        textView = view.findViewById(R.id.textView);
        textView2 = view.findViewById(R.id.textView2);
        textView.setText("       Pratibha Patil \n  25 July 2007 – 25 July 2012");
        textView2.setText("-1983–85  Cabinet Minister, Civil Supplies and Social Welfare, Government of Maharashtra\n" +
                "-1986–1988  Deputy Chairman, Rajya Sabha\n" +
                "-1986–88  Chairman, Committee of Privileges\n"
                );
        return view;
    }
}



