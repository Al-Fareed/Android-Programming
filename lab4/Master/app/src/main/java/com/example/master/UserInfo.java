package com.example.master;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class UserInfo extends AppCompatActivity {
    RadioGroup rdGroup;
    CheckBox cArt,cSocialWork,cSports;
    EditText nameText;
    Button submitBtn;
    TextView textView1,textView2;
    ImageView profile;
    String gender = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        rdGroup = (RadioGroup) findViewById(R.id.genderGroup);

        cArt = (CheckBox) findViewById(R.id.artCheck);
        cSocialWork = (CheckBox) findViewById(R.id.socialCheck);
        cSports = (CheckBox) findViewById(R.id.sportsCheck);

        nameText = (EditText) findViewById(R.id.textName);
        submitBtn = (Button) findViewById(R.id.submitBtn);

        textView1  = (TextView) findViewById(R.id.textView1);
        textView2  = (TextView) findViewById(R.id.textView2);
        profile = (ImageView) findViewById(R.id.profile);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
                textView1.setText("Hello " + name);
                textView1.setTextColor(getResources().getColor(R.color.black));

                textView2.setText(name + " is " + gender + "\n" + name + " likes " + hobby);
                profile.setBackground(getResources().getDrawable(R.drawable.joker));
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
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