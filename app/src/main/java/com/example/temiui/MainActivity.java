package com.example.temiui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Method for ShowGif endpoint
    public void displayGif (String name) {
        String Gifname = "R.drawable." + name;
        ImageView imageView = findViewById(R.id.imageView);
        Glide.with(this).load(Gifname).into(imageView);
    }

    //Method for ShowGif Button
    public void ShowGif(View view) {
        ImageView imageView = findViewById(R.id.imageView);
        Glide.with(this).load(R.drawable.happy).into(imageView);
    }

    public void ShowListView(View view) {
        startActivity(new Intent(this, ExpandableExampleActivity.class));    }
}
