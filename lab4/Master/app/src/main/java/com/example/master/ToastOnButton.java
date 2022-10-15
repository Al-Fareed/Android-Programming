package com.example.master;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ToastOnButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_on_button);
    }
    public void showToast(View view) {
        Toast.makeText(getApplicationContext(), "Toast on Button", Toast.LENGTH_SHORT).show();
    }
}