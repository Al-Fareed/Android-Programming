package com.example.userloginregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    Button log;
    EditText uname,pass;
    TextView err;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        log = (Button) findViewById(R.id.btnLog);
        uname = (EditText) findViewById(R.id.etUName);
        pass = (EditText) findViewById(R.id.etPassword);
        err = (TextView) findViewById(R.id.txtError);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = getSharedPreferences("UserInfo",MODE_PRIVATE);

                String name = uname.getText().toString();
                String upass = pass.getText().toString();

                String username = preferences.getString("Username","");
                String password = preferences.getString("Password","");

                if(name.equals(username) && upass.equals(password)) {
                    Toast.makeText(LoginPage.this, "Login Successful", Toast.LENGTH_SHORT).show();
                } else {
                    err.setText("Username and password are not correct!! ");

                }
            }
        });
    }
}