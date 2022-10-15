package com.example.master;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorMain extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnClear,btnAdd,btnSub,btnMul,btnDiv,btnDot,btnSubmit;
    TextView outputView;

    float value1,value2;
    String oprType = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_main);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn0 = (Button) findViewById(R.id.button0);
        btnClear = (Button) findViewById(R.id.buttonClear);
        btnAdd = (Button) findViewById(R.id.buttonAdd);
        btnSub = (Button) findViewById(R.id.buttonSub);
        btnMul = (Button) findViewById(R.id.buttonMul);
        btnDiv = (Button) findViewById(R.id.buttonDiv);
        btnDot = (Button) findViewById(R.id.buttonDot);
        btnSubmit = (Button) findViewById(R.id.buttonSubmit);

        outputView = (TextView) findViewById(R.id.outputView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputView.setText(outputView.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputView.setText(outputView.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputView.setText(outputView.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputView.setText(outputView.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputView.setText(outputView.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputView.setText(outputView.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputView.setText(outputView.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputView.setText(outputView.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputView.setText(outputView.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputView.setText(outputView.getText() + "0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputView.setText(outputView.getText() + ".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat((String) outputView.getText());
                outputView.setText("");
                oprType = "+";
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat((String) outputView.getText());
                outputView.setText("");
                oprType = "-";
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat((String) outputView.getText());
                outputView.setText("");
                oprType = "*";
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat((String) outputView.getText());
                outputView.setText("");
                oprType = "/";
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2 = Float.parseFloat((String) outputView.getText());

                if(oprType == "+") {
                    outputView.setText(value1 + value2 + "");
                } else if(oprType == "-") {
                    outputView.setText(value1 - value2 + "");
                } else if(oprType == "*") {
                    outputView.setText(value1 * value2 + "");
                } else if(oprType == "/") {
                    outputView.setText(value1 / value2 + "");
                }
                value1 = 0;
                value2 = 0;
            }
        });


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputView.setText("");
                oprType = "";
                value1 = 0;
                value2 = 0;
            }
        });
    }
}