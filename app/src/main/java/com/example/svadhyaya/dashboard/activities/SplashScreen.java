package com.example.svadhyaya.dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.svadhyaya.LoginWithPasswordActivity;
import com.example.svadhyaya.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
// Using handler with postDelayed called runnable run method
            @Override
            public void run() {

                Intent i = new Intent(SplashScreen.this, LoginWithPasswordActivity.class);
                startActivity(i);
                // close this activity
                finish();
            }
        }, 5*1000);



    }
}