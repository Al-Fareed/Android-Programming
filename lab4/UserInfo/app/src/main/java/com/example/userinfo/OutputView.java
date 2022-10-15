package com.example.userinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class OutputView extends AppCompatActivity {

    TextView text1,text2;
    ImageView profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output_view);
        text1 = (TextView) findViewById(R.id.textView1);
        text2 = (TextView) findViewById(R.id.textView2);
        profile = (ImageView) findViewById(R.id.profile);

        Intent intentData = getIntent();
        text1.setText(intentData.getExtras().getString("text1"));
        text2.setText(intentData.getExtras().getString("text2"));
    }

    public void goBack(View view) {
        Intent intentData = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intentData);
    }
}