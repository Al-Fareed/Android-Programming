package com.example.spinnerbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] bank={"-select- ","SBI","ICICI","HDFC","CANARA"};
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int pos, long id )
    {
        // Toast.makeText(getApplicationContext(),bank[pos],Toast.LENGTH_LONG).show();
        switch(pos) {
            case 0:
                break;
            case 1:
                LayoutInflater li = getLayoutInflater();
                View layout = li.inflate(R.layout.sbi, (ViewGroup) findViewById(R.id.sbiIfsc));
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();
                break;
            case 2:
                LayoutInflater li1 = getLayoutInflater();
                View layout1 = li1.inflate(R.layout.icici, (ViewGroup) findViewById(R.id.icicIfsc));
                Toast toast1 = new Toast(getApplicationContext());
                toast1.setDuration(Toast.LENGTH_LONG);
                toast1.setView(layout1);
                toast1.show();
                break;
            case 3:
                LayoutInflater li2 = getLayoutInflater();
                View layout2 = li2.inflate(R.layout.hdfc, (ViewGroup) findViewById(R.id.hdfcIfsc));
                Toast toast2 = new Toast(getApplicationContext());
                toast2.setDuration(Toast.LENGTH_LONG);
                toast2.setView(layout2);
                toast2.show();
                break;
            case 4:
                LayoutInflater li3 = getLayoutInflater();
                View layout3 = li3.inflate(R.layout.canara, (ViewGroup) findViewById(R.id.canaraIfsc));
                Toast toast3 = new Toast(getApplicationContext());
                toast3.setDuration(Toast.LENGTH_LONG);
                toast3.setView(layout3);
                toast3.show();
                break;

            default:
                break;

        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0)
    {
        //TODO
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter dropdown = new ArrayAdapter(this, android.R.layout.simple_spinner_item, bank);
        dropdown.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(dropdown);
        spin.setOnItemSelectedListener(this);
    }
}
