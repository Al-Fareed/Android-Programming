package com.example.president;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.toast:
                Toast.makeText(getApplicationContext(),"Item Toast Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.exit:
                MainActivity.this.finish();
                System.exit(0);
                return true;
            case R.id.president:
                Intent first=new Intent(MainActivity.this,presidentPage.class);
                startActivity(first);
                return true;
            case R.id.gallery:
                Intent second=new Intent(MainActivity.this,gallery.class);
                startActivity(second);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
