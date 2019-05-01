package com.example.testlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

    private ImageView miaImmagine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        miaImmagine = (ImageView) findViewById(R.id.imageView);
        miaImmagine.setImageResource(R.drawable.a);
    }
}
