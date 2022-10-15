package com.example.master;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorLinear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_linear);

        Button resetButton = (Button) findViewById(R.id.resetBtn);
        Button submitButton = (Button) findViewById(R.id.submitBtn);

        EditText input1 = (EditText) findViewById(R.id.inputNum1);
        EditText input2 = (EditText) findViewById(R.id.inputNum2);

        TextView outputView = (TextView) findViewById(R.id.outputView);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = input1.getText().toString();
                String value2 = input2.getText().toString();
                if(value1.length() == 0 || value2.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Enter valid input to continue", Toast.LENGTH_SHORT).show();
                    return;
                }
                try {
                    int a = Integer.parseInt(value1);
                    int b = Integer.parseInt(value2);

                    String outputString = " OUTPUT: " + Integer.toString(a+b);
                    outputView.setText(outputString);

                    Toast.makeText(getApplicationContext(), outputString, Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Enter valid integer values", Toast.LENGTH_SHORT).show();
                }
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1.setText("");
                input2.setText("");
                outputView.setText("");
            }
        });
    }
}