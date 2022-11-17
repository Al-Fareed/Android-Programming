package com.example.databaseapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit = (Button) findViewById(R.id.button);
    EditText name = (EditText) findViewById(R.id.name);
    EditText dob = (EditText) findViewById(R.id.dob);
    EditText contact = (EditText) findViewById(R.id.contact);
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DB = new DBHelper(this);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTxt = name.getText().toString();
                String contactTxt = contact.getText().toString();
                String dobTxt = dob.getText().toString();
                Boolean checkInsertion = DB.insertData(nameTxt,contactTxt,dobTxt);
                if(checkInsertion == true)
                {
                    Toast.makeText(MainActivity.this, "Inserted", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Nope", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}