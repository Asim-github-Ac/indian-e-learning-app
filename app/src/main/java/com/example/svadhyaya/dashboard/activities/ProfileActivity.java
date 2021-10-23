package com.example.svadhyaya.dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.TextView;

import com.example.svadhyaya.R;
import com.example.svadhyaya.Retrofit.APIClient;
import com.example.svadhyaya.Retrofit.APIInterface;
import com.example.svadhyaya.RetrofitModel.GetProfile;
import com.example.svadhyaya.RetrofitModel.LogOut;
import com.example.svadhyaya.SharedPrefrence.PrefManager;

import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProfileActivity extends AppCompatActivity {
PrefManager prefManager;
APIInterface apiInterface;
CircleImageView profileimage;
TextView username,profileid,grade,subscription,mobileno,enddate,country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        initilization();
        prefManager=new PrefManager(this);
        apiInterface = APIClient.getClient().create(APIInterface.class);
        GetUserProfile(prefManager.getWeb_time());

    }
    public void GetUserProfile(String authkey){
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();
        final GetProfile getProfile=new GetProfile(authkey);
        Call<GetProfile> call=apiInterface.getprofile(getProfile);
        call.enqueue(new Callback<GetProfile>() {
            @Override
            public void onResponse(Call<GetProfile> call, Response<GetProfile> response) {
                System.out.println("response"+response);
                GetProfile getProfile1 = response.body();
                System.out.println(getProfile1.getMessage());
                if (getProfile1 !=null && getProfile1.getStatus().equals("true")){
                    System.out.println("sout successfully get data________"+getProfile1.getProfileData().getEmail_id());
                    progressDialog.dismiss();

                }
                else {
                progressDialog.dismiss();
                System.out.println("Something Wrong");
                }
            }
            @Override
            public void onFailure(Call<GetProfile> call, Throwable t) {
                System.out.println("errors_________________"+t.getMessage());
                progressDialog.dismiss();
            }
        });
    }
    public void initilization(){
        username=findViewById(R.id.username);
        profileimage=findViewById(R.id.profilepic);
        profileid=findViewById(R.id.profileidis);
        grade=findViewById(R.id.gradeis);
        subscription=findViewById(R.id.subscriptionis);
        mobileno=findViewById(R.id.mobilenumberis);
        enddate=findViewById(R.id.enddateis);
        country=findViewById(R.id.countryis);


    }
}