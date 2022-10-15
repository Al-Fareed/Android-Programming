package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAc,btnEq,btnMul,btnDiv,btnAdd,btnSub,btnDot,btnAllC;
    TextView t1;
    boolean add,sub,div,mul;
     float num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view;
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnAc = (Button) findViewById(R.id.btnClear);
        btnEq = (Button) findViewById(R.id.btnEqual);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnAdd = (Button) findViewById(R.id.btnPlus);
        btnSub = (Button) findViewById(R.id.btnMinus);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnAllC=(Button) findViewById(R.id.Allclear);
        t1=(TextView) findViewById(R.id.textView);

            btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+ "1");
            }
        });
            btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+ "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+ "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+ "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+ "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+ "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+ "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+ "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+ "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+ "0");
            }
        });
        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("");
            }
        });
        btnAllC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("");
                num1=0;
                num2=0;
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1.getText()!=""){
                    add=true;
                    num1=Float.parseFloat(t1.getText()+"");
                    t1.setText("");
                }
                else
                {
                    t1.setText("");
                    Toast.makeText(MainActivity.this, "Enter a number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1.getText()!=""){
                    sub=true;
                    num1=Float.parseFloat(t1.getText()+"");
                    t1.setText("");
                }
                else
                {
                    t1.setText("");
                    Toast.makeText(MainActivity.this, "Enter a number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1.getText()!=""){
                    div=true;
                    num1=Float.parseFloat(t1.getText()+"");
                    t1.setText("");
                }
                else
                {
                    t1.setText("");
                    Toast.makeText(MainActivity.this, "Enter a number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1.getText()!=""){
                    mul=true;
                    num1=Float.parseFloat(t1.getText()+"");
                    t1.setText("");
                }
                else
                {
                    t1.setText("");
                    Toast.makeText(MainActivity.this, "Enter a number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1.getText()!=""){
                    add=true;
                    num2=Float.parseFloat(t1.getText()+"");
                    t1.setText("");
                }
                else
                {
                    t1.setText("");
                    Toast.makeText(MainActivity.this, "Enter a number", Toast.LENGTH_SHORT).show();
                }

                if(add)
                {
                    t1.setText(""+(num1 + num2));
                }
                if(sub)
                {
                    t1.setText(""+(num1 - num2));
                }
                if(mul)
                {
                    t1.setText(""+(num1 * num2));
                }
                if(div)
                {
                    t1.setText(""+(num1 / num2));
                }

            }
        });

    }


}