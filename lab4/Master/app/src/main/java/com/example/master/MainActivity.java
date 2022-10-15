package com.example.master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void redirectHelloWorld(View view) {
        Intent intentRedirect = new Intent(getApplicationContext(), HelloWorld.class);
        startActivity(intentRedirect);
    }
    public void redirectLifeCycle(View view) {
        Intent intentRedirect = new Intent(getApplicationContext(), LifeCycle.class);
        startActivity(intentRedirect);
    }
    public void redirectCalcConstraint(View view) {
        Intent intentRedirect = new Intent(getApplicationContext(), CalculatorConstraint.class);
        startActivity(intentRedirect);
    }
    public void redirectToastOnLoad(View view) {
        Intent intentRedirect = new Intent(getApplicationContext(), ToastOnLoad.class);
        startActivity(intentRedirect);
    }
    public void redirectToastOnButton(View view) {
        Intent intentRedirect = new Intent(getApplicationContext(), ToastOnButton.class);
        startActivity(intentRedirect);
    }
    public void redirectCalcLinear(View view) {
        Intent intentRedirect = new Intent(getApplicationContext(), CalculatorLinear.class);
        startActivity(intentRedirect);
    }
    public void redirectCalcRelative(View view) {
        Intent intentRedirect = new Intent(getApplicationContext(), CalculatorRelative.class);
        startActivity(intentRedirect);
    }
    public void redirectCalcMain(View view) {
        Intent intentRedirect = new Intent(getApplicationContext(), CalculatorMain.class);
        startActivity(intentRedirect);
    }
    public void redirectUserInfo(View view) {
        Intent intentRedirect = new Intent(getApplicationContext(), UserInfo.class);
        startActivity(intentRedirect);
    }

    public void redirectMainUserInfo(View view) {
        Intent intentRedirect = new Intent(getApplicationContext(), UserInfoPage1.class);
        startActivity(intentRedirect);
    }
}