package com.example.svadhyaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.svadhyaya.dashboard.activities.MainActivity;

public class CreatePasswordActivity extends AppCompatActivity {

    private EditText etPassword,etPasswordCnf;
    private Button btnRestPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_password);
        init();

        btnRestPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(CreatePasswordActivity.this, "All Screen Done", Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(CreatePasswordActivity.this, MainActivity.class);
                startActivity(intent);
                finishAffinity();
            }
        });
    }

    private void init() {
        etPassword=findViewById(R.id.et_password);
        etPasswordCnf=findViewById(R.id.et_confirm_password);
        btnRestPassword=findViewById(R.id.btn_rest_password);

    }
}