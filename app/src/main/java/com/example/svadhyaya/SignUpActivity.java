package com.example.svadhyaya;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.svadhyaya.Retrofit.APIClient;
import com.example.svadhyaya.Retrofit.APIInterface;
import com.example.svadhyaya.RetrofitModel.RegisterModel;
import com.hbb20.CountryCodePicker;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    Spinner genders;
    private String selectedgender = null;
    String concode,newcode;
    private int account_type_spinner_value_position;
    EditText fname,mname,lname,email,password,birthday,mobile,address,city,state,country,parentcontact,parentemail;
    Button signup;
    private CountryCodePicker codePicker;
    APIInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initilization();
        apiInterface = APIClient.getClient().create(APIInterface.class);
        Spiner();
        signup.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.signup:
                concode=codePicker.getSelectedCountryCode().toString();
                newcode=concode+mobile.getText().toString();
                Toast.makeText(this, "code" + newcode, Toast.LENGTH_SHORT).show();
                SignUpNow(fname.getText().toString(),mname.getText().toString(),lname.getText().toString(),email.getText().toString(),
                        password.getText().toString(),selectedgender,birthday.getText().toString(),newcode,address.getText().toString(),
                        city.getText().toString(),state.getText().toString(),country.getText().toString(),parentcontact.getText().toString(),parentemail.getText().toString()
                        );
                System.out.println("code" + newcode);
                break;
        }
    }
    public void initilization(){
        genders=findViewById(R.id.spiner);
        signup=findViewById(R.id.signup);
        fname=findViewById(R.id.fname);
        mname=findViewById(R.id.mname);
        lname=findViewById(R.id.lname);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        birthday=findViewById(R.id.birthday);
        mobile=findViewById(R.id.mobileno);
        address=findViewById(R.id.address);
        city=findViewById(R.id.city);
        state=findViewById(R.id.state);
        country=findViewById(R.id.country);
        parentcontact=findViewById(R.id.parentcontact);
        parentemail=findViewById(R.id.parentemail);
        codePicker=findViewById(R.id.codecountry);
    }

  public void SignUpNow(String fname,String mname,String lname,String email,String pass,String gender,String Bday,String mobile,String addres,String cityy,String statee,String countryy,String parecon,String parentemaills  ){
      final ProgressDialog progressDialog = new ProgressDialog(this);
      progressDialog.setMessage("Loading...");
      progressDialog.show();
      System.out.println("code   "+mobile);
        final RegisterModel registerModel= new RegisterModel(fname,mname,lname,email,pass,gender,Bday,mobile,addres,cityy,statee,countryy,parecon,parentemaills);
      Call<RegisterModel> call = apiInterface.createUser(registerModel);
      call.enqueue(new Callback<RegisterModel>() {
          @Override
          public void onResponse(Call<RegisterModel> call, Response<RegisterModel> response) {
              System.out.println("response"+response);
              RegisterModel registerres = response.body();
              Log.e("keshav", "loginResponse 1 --> " + registerres.getResponseCode());
              if (registerres != null && registerres.getResponseCode().equals("true")) {
                  String responseCode = registerres.getResponseMessage();
                  System.out.println("code is  "+responseCode);
                  Intent intent =new Intent(SignUpActivity.this,LoginWithPasswordActivity.class);
                  startActivity(intent);
                  progressDialog.dismiss();
                  finish();
                  if (responseCode != null && responseCode.equals("404")) {
                      Toast.makeText(SignUpActivity.this, "Invalid Login Details \n Please try again", Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();
                  } else {
                      Toast.makeText(SignUpActivity.this, "Welcome " + registerres.getResponseMessage(), Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();
                  }
              }
          }
          @Override
          public void onFailure(Call<RegisterModel> call, Throwable t) {
              System.out.println(" errors"  +t.getMessage());
              progressDialog.dismiss();

          }
      });



  }

  public void Spiner(){
      ArrayAdapter<CharSequence> aa = ArrayAdapter.createFromResource(this,R.array.gender,R.layout.custom_spinner);
      aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
      genders.setAdapter(aa);

      genders.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
          @Override
          public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              selectedgender = parent.getItemAtPosition(position).toString();
              account_type_spinner_value_position = position;

          }

          @Override
          public void onNothingSelected(AdapterView<?> parent) {
          }
      });
  }


}