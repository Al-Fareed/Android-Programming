package com.example.l12master;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class Timepick extends AppCompatActivity {

    TextView txtView;
    TimePicker tPicker;
    Button btnTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timepick);

        txtView=(TextView) findViewById(R.id.textView);
        tPicker=(TimePicker) findViewById(R.id.timePicker);
        btnTime=(Button) findViewById(R.id.button2);

        tPicker.setIs24HourView(true);

        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(getCurrentTime());
            }
        });
    }

    public String getCurrentTime(){
        String currentTime="current Time: "+tPicker.getCurrentHour()+":"+tPicker.getCurrentMinute();
        return currentTime;
    }
}