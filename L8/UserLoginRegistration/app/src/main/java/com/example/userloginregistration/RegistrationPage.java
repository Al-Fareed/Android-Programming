package com.example.userloginregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationPage extends AppCompatActivity {

    EditText etName, etPass,etEmail,etPhone,etCourse, etAge;
    RadioGroup rgGen;
    String uname,password,email,phone,course,gender,age;
    TextView txtErr;
    Button btnReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        rgGen = (RadioGroup) findViewById(R.id.rgGender);
        etName = (EditText) findViewById(R.id.etName);
        etPass = (EditText) findViewById(R.id.etPassword);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPhone = (EditText) findViewById(R.id.etPhone);
        etCourse = (EditText) findViewById(R.id.etCourse);
        etAge = (EditText) findViewById(R.id.etAge);

        txtErr = (TextView) findViewById(R.id.Error);

        btnReg = (Button) findViewById(R.id.btnRegister);

        rgGen.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rbMale:
                        gender = "Male";
                        break;
                    case R.id.rbFemale:
                        gender = "Female";
                        break;
                    case R.id.rbOther:
                        gender = "Other";
                        break;
                    default:
                }
            }
        });

        btnReg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String err="";
                uname = etName.getText().toString();
                password = etPass.getText().toString();
                email = etEmail.getText().toString();
                phone = etPhone.getText().toString();
                course = etCourse.getText().toString();
                age = etAge.getText().toString();

                //Toast.makeText(RegistrationPage.this, "Added to Database", Toast.LENGTH_SHORT).show();
                if(isInputEmpty(uname))
                    err +="Please enter username";
                if(isInputEmpty(password))
                    err +="\nPlease enter password";
                if(isInputEmpty(email))
                    err +="\nPlease enter email";
                if(isInputEmpty(phone))
                    err +="\nPlease enter phone";
                if(isInputEmpty(course))
                    err +="\nPlease enter course";
                if(isInputEmpty(age))
                    err +="\nPlease enter age";

                if(!isValidPass(password))
                    err += "\nPlease enter valid Password(min 6 chars)";

                if(!isValidPhone(phone))
                    err += "\nPlease enter valid phone number(10 digits)";

                if(!isValidEmail(email))
                    err += "\nPlease enter valid Email(domain name .com|.edu|.in|.org)";

                txtErr.setText(err);

                if(err.isEmpty()) {
                    SharedPreferences preferences = getSharedPreferences("UserInfo",MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();

                    editor.putString("Username", uname);
                    editor.putString("Password", password);
                    editor.commit();

                    Toast.makeText(RegistrationPage.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public static boolean isInputEmpty(String str) {
        if(str.isEmpty())
            return true;
        return false;
    }

    public static boolean isValidPass(String str) {
        String regex = "^[a-zA-z0-9]{6,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if(matcher.matches())
            return true;
        return false;
    }

    public static boolean isValidPhone(String str) {
        String regex = "^\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if(matcher.matches())
            return true;
        return false;
    }

    public static boolean isValidEmail(String str) {
        String regex = "[a-zA-Z0-9._-]+@[a-z]+\\.(com|edu|in|org)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if(matcher.matches())
            return true;
        return false;
    }
}