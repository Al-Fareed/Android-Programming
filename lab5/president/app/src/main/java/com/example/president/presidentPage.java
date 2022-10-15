package com.example.president;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

public class presidentPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_president_page);
        Intent first = getIntent();
        ListView listView = findViewById(R.id.listView1);
        FrameLayout f1 = findViewById(R.id.frameLayout);
        String[] listItem = getResources().getStringArray(R.array.array_list);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String value = adapter.getItem(position);
                if (value.equals("ABDUL KALAM"))
                    loadFragment(new abdulKalam());
                else if (value.equals("PRATHIBA PATIL"))
                    loadFragment(new prathiba());
                else if (value.equals("PRANAB MUKHERJEE"))
                    loadFragment(new pranam());
                else if (value.equals("RAMNATH KOVIND"))
                    loadFragment(new ramnath());
                else if (value.equals("DROUPADI MURMU"))
                    loadFragment(new droupadi());

            }
        });
    }


    public void loadFragment(Fragment fragment) {
        FragmentManager fm = getFragmentManager();
        // FragmentManager fragmentManager = getFragmentManager();
        //FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}
