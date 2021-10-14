package com.example.svadhyaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hbb20.CountryCodePicker;

public class LoginActivity extends AppCompatActivity {
    private Button btnNext;
    private EditText etPhoneNum;
    private CountryCodePicker codePicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,LoginWithPasswordActivity.class);
                startActivity(intent);
            }
        });

    }

    private void init() {
        btnNext=findViewById(R.id.btn_next);
        etPhoneNum=findViewById(R.id.editTextPhone);
        codePicker=findViewById(R.id.ccp);
    }
}