package com.example.master;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ToastOnLoad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_on_load);

        Toast.makeText(getApplicationContext(), "Toast on Load", Toast.LENGTH_SHORT).show();
    }
}