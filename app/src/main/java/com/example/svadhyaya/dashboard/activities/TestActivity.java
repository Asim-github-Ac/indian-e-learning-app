package com.example.svadhyaya.dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.svadhyaya.R;
import com.example.svadhyaya.dashboard.fragments.ContactUsFragment;
import com.example.svadhyaya.dashboard.fragments.HomeFragment;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        getFragment(new ContactUsFragment());
    }
    private void getFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.test_container,fragment).commit();
    }

}