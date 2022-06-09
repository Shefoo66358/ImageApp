package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Secend extends AppCompatActivity {
    ImageView image;
    TextView name , details ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secend);
        image = findViewById(R.id.imageView);
        name = findViewById(R.id.label);
        details = findViewById(R.id.Info);

        Bundle extras = getIntent().getExtras();
        String n = extras.getString("name");
        String in = extras.getString("info");
        String k = extras.getString("key");
        name.setText(n);
        details.setText(in);
        CheckKey(k);
    }

  public void CheckKey(String key){
        if(key.equals("Android")){
            image.setImageDrawable(getResources().getDrawable(R.drawable.android));
        }
        else if(key.equals("Java ")){
            image.setImageDrawable(getResources().getDrawable(R.drawable.java));
        }
  }

}
