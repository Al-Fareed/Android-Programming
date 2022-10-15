package com.example.president;


        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.widget.ImageView;
        import android.widget.Toast;
public class FullscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
        Intent i=getIntent();
        int position=i.getExtras().getInt("id");
        //Toast.makeText(FullscreenActivity.this,"item "+position+" clicked",Toast.LENGTH_LONG).show();
        image image = new image(this);
        ImageView imageview=(ImageView) findViewById(R.id.full_image_view);
        imageview.setImageResource(image.thumbImages[position]);
    }
}
