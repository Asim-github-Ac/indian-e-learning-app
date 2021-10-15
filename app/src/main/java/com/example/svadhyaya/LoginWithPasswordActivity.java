package com.example.svadhyaya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.svadhyaya.Retrofit.APIClient;
import com.example.svadhyaya.Retrofit.APIInterface;
import com.example.svadhyaya.RetrofitModel.UserDetails;
import com.example.svadhyaya.RetrofitModel.UserLogin;
import com.example.svadhyaya.SharedPrefrence.PrefManager;
import com.example.svadhyaya.dashboard.activities.MainActivity;
import com.google.android.material.snackbar.Snackbar;
import com.hbb20.CountryCodePicker;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginWithPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnNext;
    private EditText etPhoneNum,etPassword;
    TextView signup;
    String concode,newconcode;
    private CountryCodePicker codePicker;
    ConstraintLayout constraintLayout;
    APIInterface apiInterface;
    PrefManager prefManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_with_password);
        init();
        apiInterface = APIClient.getClient().create(APIInterface.class);
        prefManager=new PrefManager(this);
        btnNext.setOnClickListener(this);
        signup.setOnClickListener(this);

        System.out.println("code"+codePicker.getTextView_selectedCountry().getText().toString());
    }
    private void init() {
        btnNext=findViewById(R.id.btn_next);
        etPhoneNum=findViewById(R.id.editTextPhone);
        etPassword=findViewById(R.id.et_password);
        codePicker=findViewById(R.id.ccp);
        constraintLayout=findViewById(R.id.constrantlayout);
        signup=findViewById(R.id.Signup);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_next:
                concode=codePicker.getSelectedCountryCode().toString();
                newconcode=concode+etPhoneNum.getText().toString();
                SignIn(newconcode,etPassword.getText().toString().trim());
                break;
            case R.id.Signup:
                Intent intent=new Intent(getApplicationContext(),SignUpActivity.class);
                startActivity(intent);
                break;

        }
    }
    public void SignIn(String username,String password){
        System.out.println("code"+username.toString());
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();
        final UserDetails userDetails=new UserDetails();
        final UserLogin userLogin=new UserLogin(username,password,"23");
        Call<UserLogin>  call= apiInterface.userlogin(userLogin);
        call.enqueue(new Callback<UserLogin>() {
            @Override
            public void onResponse(Call<UserLogin> call, Response<UserLogin> response) {
                System.out.println("response"+response);
                UserLogin loginResponse = response.body();
                System.out.println(loginResponse.getMessage());
               try {
                   if (loginResponse != null && loginResponse.getMessage().equals("Login Successfully..") ) {
                       SnackBar("Successfully Login");
                       Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                       startActivity(intent);
                       progressDialog.dismiss();
//                       prefManager.setAuthkey(loginResponse.getUser().getAuthkey());
                       prefManager.setUser_name_info(loginResponse.getUser().getName());
                       prefManager.setSave_Email_InFo(loginResponse.getUser().getEmaild());
//                       prefManager.setIs_demo(loginResponse.getUser().getDemo());
//                       prefManager.setProfile_updated_status(loginResponse.getUser().getProfilestatus());

                       System.out.println("auth key iss -------"+loginResponse.getUser().getName());
                   }
                   else {
                       SnackBar("Enter Valid User Name");
                       progressDialog.dismiss();
                   }
               }catch (Exception exception){
                   progressDialog.dismiss();
               }
            }
            @Override
            public void onFailure(Call<UserLogin> call, Throwable t) {
                SnackBar("Something Wrong");
                progressDialog.dismiss();
                System.out.println("failer errors is "+t.getMessage());
            }
        });
    }
    public void SnackBar(String msg){
        Snackbar snackbar = Snackbar
                .make(constraintLayout, msg, Snackbar.LENGTH_LONG)
                .setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar1 = Snackbar.make(constraintLayout, "Wrong!", Snackbar.LENGTH_SHORT);
                        snackbar1.show();
                    }
                });
        snackbar.show();
    }
    public void SecondMethod(String uname,String pass){


    }
}