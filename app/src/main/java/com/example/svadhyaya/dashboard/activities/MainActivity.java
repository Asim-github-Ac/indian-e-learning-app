package com.example.svadhyaya.dashboard.activities;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.example.svadhyaya.R;
import com.example.svadhyaya.Retrofit.APIClient;
import com.example.svadhyaya.Retrofit.APIInterface;
import com.example.svadhyaya.RetrofitModel.PackMoreDetails;
import com.example.svadhyaya.RetrofitModel.PakagesDetails;
import com.example.svadhyaya.RetrofitModel.UserLogin;
import com.example.svadhyaya.SharedPrefrence.PrefManager;
import com.example.svadhyaya.dashboard.fragments.HomeFragment;
import com.example.svadhyaya.math.MathFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //drawer
    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private BottomNavigationView mBottomNavigationView;
    PrefManager prefManager;
    APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initilization();
        prefManager=new PrefManager(this);
        Log.d("tags", "onCreate:   key"+ prefManager.getWeb_time());
        apiInterface = APIClient.getClient().create(APIInterface.class);
        getFragment(new HomeFragment());
        mBottomNavigationView.setOnNavigationItemSelectedListener(bottomNav);
        PackagesDetails(prefManager.getWeb_time());



    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){

        }
    }
    private BottomNavigationView.OnNavigationItemSelectedListener bottomNav = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){

                case R.id.b_home:
                    getFragment(new HomeFragment());
                    break;
                case R.id.b_live_lessons:
                    break;
                case R.id.b_video_library:
                    getFragment(new MathFragment());
                    break;
                case R.id.b_q_a:
                    break;
            }
            return true;
        }
    };
    private void getFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
    }
    @Override
    public void onBackPressed() {
        if(mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
    public void openDrawer(){
        mDrawerLayout.openDrawer(GravityCompat.START);
    }

    public void PackagesDetails(String auth){
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();
        final PakagesDetails packdetails=new PakagesDetails(auth);
        Call<PakagesDetails> call= apiInterface.PackDetails(packdetails);

        call.enqueue(new Callback<PakagesDetails>() {
            @Override
            public void onResponse(Call<PakagesDetails> call, Response<PakagesDetails> response) {
                System.out.println("response"+response);
                PakagesDetails details = response.body();
                System.out.println(details.getMessage());
                try {
                    if (details != null && details.getStatus().equals("true")){
                        System.out.println("yahooo ____________"+response);
                        progressDialog.dismiss();
                        System.out.println("yahooo data also done  "+details.getUser().getPackMoreDetails().getEmail_id());

                        Log.d("tags", "onResponse:   final"+details.getPackdata().getDescription());
                        System.out.println("yahhooooo second clas data __________________________  "+details.getPackdata().getPackage_name());
                    }

                }catch (Exception e){
                    progressDialog.dismiss();
                    System.out.println("Expection __________"+e.getMessage());
                }
            }
            @Override
            public void onFailure(Call<PakagesDetails> call, Throwable t) {
            progressDialog.dismiss();
                System.out.println("errros fails______________"+t.getMessage());
            }
        });
    }
    public void initilization(){
        mDrawerLayout = findViewById(R.id.drawer);
        mNavigationView = findViewById(R.id.navigation_view);
        mBottomNavigationView = findViewById(R.id.bottom_nav);
    }
}