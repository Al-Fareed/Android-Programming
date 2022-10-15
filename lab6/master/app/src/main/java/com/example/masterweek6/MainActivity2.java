package com.example.masterweek6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.*;

public class MainActivity2 extends AppCompatActivity {
    DatePicker picker;
    TimePicker time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textview=findViewById(R.id.textView);
        Button b1=findViewById(R.id.b1);
        time=findViewById(R.id.time);
        picker=findViewById(R.id.datepicker);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.setText("change date: "+getCurrentDate());
            }
        });
    }
    public String getCurrentDate()
    {
        StringBuilder builder=new StringBuilder();
        builder.append((picker.getMonth()+1)+"/");
        builder.append(picker.getDayOfMonth()+"/");
        builder.append(picker.getYear());
        builder.append("\n current time:"+time.getCurrentHour()+":"+time.getCurrentMinute());
        return builder.toString();
    }
}