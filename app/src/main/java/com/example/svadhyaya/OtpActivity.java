package com.example.svadhyaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OtpActivity extends AppCompatActivity {

   private EditText etOtp1,etOtp2,etOtp3,etOtp4,etOtp5,etOtp6;
   private Button btnRestPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        init();

        btnRestPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OtpActivity.this,CreatePasswordActivity.class);
                startActivity(intent);
            }
        });
    }

    private void init() {
        etOtp1=findViewById(R.id.et_otp_no1);
        etOtp2=findViewById(R.id.et_otp_no2);
        etOtp3=findViewById(R.id.et_otp_no3);
        etOtp4=findViewById(R.id.et_otp_no4);
        etOtp5=findViewById(R.id.et_otp_no5);
        etOtp6=findViewById(R.id.et_otp_no6);
        btnRestPassword=findViewById(R.id.btn_rest_password);
    }
}