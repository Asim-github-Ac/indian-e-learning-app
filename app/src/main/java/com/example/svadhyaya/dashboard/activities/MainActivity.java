package com.example.svadhyaya.dashboard.activities;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.example.svadhyaya.R;
import com.example.svadhyaya.dashboard.fragments.HomeFragment;
import com.example.svadhyaya.math.MathFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity {

    //drawer
    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = findViewById(R.id.drawer);
        mNavigationView = findViewById(R.id.navigation_view);
        mBottomNavigationView = findViewById(R.id.bottom_nav);

        getFragment(new HomeFragment());

        mBottomNavigationView.setOnNavigationItemSelectedListener(bottomNav);

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
}