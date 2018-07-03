package com.example.berbagi.Activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.berbagi.R;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        /*handler untuk menahan activity sementara*/
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                /*mulai activity ke MainActivity setelah 5 detik*/
                startActivity(new Intent(getApplicationContext(),loginActivity.class));
                finish();
            }
            /*durasi 5000ms*/
        },5000);
    }

    @Override
    public void onBackPressed() {
        return;
    }
}
