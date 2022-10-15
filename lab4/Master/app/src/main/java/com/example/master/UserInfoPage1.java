package com.example.master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class UserInfoPage1 extends AppCompatActivity {
    RadioGroup rdGroup;
    CheckBox cArt,cSocialWork,cSports;
    EditText nameText;
    Button submitBtn;
    String gender = "";

    Boolean toggleBtn = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info_page1);

        rdGroup = (RadioGroup) findViewById(R.id.genderGroup);

        cArt = (CheckBox) findViewById(R.id.artCheck);
        cSocialWork = (CheckBox) findViewById(R.id.socialCheck);
        cSports = (CheckBox) findViewById(R.id.sportsCheck);

        nameText = (EditText) findViewById(R.id.textName);
        submitBtn = (Button) findViewById(R.id.submitBtn);


        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(toggleBtn) {
                    submitBtn.setText("Submit");
                    toggleBtn = false;
                    rdGroup.clearCheck();
                    cArt.setChecked(false);
                    cSocialWork.setChecked(false);
                    cSports.setChecked(false);
                    nameText.setText("");
                } else {
                    toggleBtn = true;
                    submitBtn.setText("Reset");
                    String hobby = "";
                    Editable name = nameText.getText();
                    if(cArt.isChecked()) {
                        hobby = "Art";
                    }
                    if(cSocialWork.isChecked()) {
                        hobby = hobby + ", Social Work";
                    }
                    if(cSports.isChecked()) {
                        hobby = hobby + ", Sports";
                    }

                    Intent intentData = new Intent(getApplicationContext(), UserInfoPage2.class);
                    intentData.putExtra("text1", "Hello " + name);
                    intentData.putExtra("text2", name + " is " + gender + "\n" + name + " likes " + hobby);
                    startActivity(intentData);
                }
            }
        });

        rdGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rfemale:
                        gender = "Female";
                        break;
                    case R.id.rmale:
                        gender = "Male";
                        break;
                    default:
                }

                Toast.makeText(getApplicationContext(),"You Selected "+ gender, Toast.LENGTH_LONG).show();
            }
        });

        cArt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(getApplicationContext(), "You selected Art", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cSocialWork.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(getApplicationContext(), "You selected Social Work", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cSports.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(getApplicationContext(), "You selected Sports", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}