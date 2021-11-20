package com.example.svadhyaya.dashboard.activities;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.svadhyaya.R;
import com.example.svadhyaya.Retrofit.APIClient;
import com.example.svadhyaya.Retrofit.APIInterface;
import com.example.svadhyaya.RetrofitModel.PakagesDetails;
import com.example.svadhyaya.SharedPrefrence.PrefManager;
import com.example.svadhyaya.dashboard.fragments.HomeFragment;
import com.example.svadhyaya.dashboard.fragments.NavigationDrawerFragment;
import com.example.svadhyaya.dashboard.fragments.SearchFromGoogleFrag;
import com.example.svadhyaya.dashboard.fragments.TopicsFragments;
import com.example.svadhyaya.math.MathFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //drawer
    private DrawerLayout mDrawerLayout;
    private BottomNavigationView mBottomNavigationView;
    PrefManager prefManager;
    APIInterface apiInterface;
    String packagename;
    Toolbar toolbar;
    DrawerLayout drawerLayout;
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
        setUpToolbar();
        setUpDrawer();

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
                    getFragment(new TopicsFragments());
                    break;
                case R.id.b_q_a:
                    getFragment(new SearchFromGoogleFrag());
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


    public void initilization(){
        mDrawerLayout = findViewById(R.id.drawer);
        mBottomNavigationView = findViewById(R.id.bottom_nav);
    }
    private void setUpToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
      //  toolbar.inflateMenu(R.menu.bottom_menu);
    }
    private void setUpDrawer() {
        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.nav_drwr_fragment);
         drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        drawerFragment.setUpDrawer(R.id.nav_drwr_fragment, drawerLayout, toolbar);

    }
    public void onSideMenuClick() {
        //place your closeDrawer code here
        drawerLayout.closeDrawer(GravityCompat.START, false);
    }
}