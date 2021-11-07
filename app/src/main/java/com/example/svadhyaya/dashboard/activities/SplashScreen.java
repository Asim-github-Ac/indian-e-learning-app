package com.example.svadhyaya.dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.svadhyaya.LoginWithPasswordActivity;
import com.example.svadhyaya.R;
import com.example.svadhyaya.SharedPrefrence.PrefManager;

public class SplashScreen extends AppCompatActivity {
PrefManager prefManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        prefManager=new PrefManager(this);

        new Handler().postDelayed(new Runnable() {
// Using handler with postDelayed called runnable run method
            @Override
            public void run() {
                String Username = prefManager.getWeb_time();
                if(Username != null && !Username.isEmpty()){
                    Intent mainIntent = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(mainIntent);
                }else {
                    Intent i = new Intent(SplashScreen.this, LoginWithPasswordActivity.class);
                    startActivity(i);
                    // close this activity
                }
                finish();
            }
        }, 5*1000);



    }
}