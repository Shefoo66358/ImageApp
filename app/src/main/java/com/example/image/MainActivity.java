package com.example.image;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView androidimage , javaimage ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidimage = findViewById(R.id.androidimage);
        javaimage = findViewById(R.id.javaimage);
        androidimage.setOnClickListener(this);
        javaimage.setOnClickListener(this);

    }

     @Override
     public void onClick(View view) {
         switch (view.getId()){
             case R.id.androidimage:
                 Intent androidintent = new Intent(MainActivity.this , Secend.class);
                 androidintent.putExtra("name", "Android OS");
                 androidintent.putExtra("info", " he Android Operating System is an open-source system. Many people say it is Linux, but that is not fully true. Though it has kernels which are similar to that of Linux, that is the only thing that is");
                 androidintent.putExtra("key", "Android");
                 startActivity(androidintent);
                 break;

             case R.id.javaimage:
                 Intent javaintent = new Intent(MainActivity.this , Secend.class);
                 javaintent.putExtra("name", "Java Programming Language");
                 javaintent.putExtra("info", "Java is a popular programming language. Java is used to develop mobile apps, web apps, desktop apps, games and much more. Start learning Java now");
                 javaintent.putExtra("key", "Java ");
                 startActivity(javaintent);
                 break;

         }
     }
 }


