package com.example.lottieandbottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    int SPLASH_TIME=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              Intent intent=new Intent(getApplicationContext(),BottomSheetActivity.class);
              startActivity(intent);
              finish();
            }
        },SPLASH_TIME);

    }
}