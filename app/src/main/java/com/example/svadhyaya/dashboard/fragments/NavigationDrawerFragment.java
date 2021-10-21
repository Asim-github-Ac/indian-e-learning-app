package com.example.svadhyaya.dashboard.fragments;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.svadhyaya.LoginWithPasswordActivity;
import com.example.svadhyaya.R;
import com.example.svadhyaya.Retrofit.APIClient;
import com.example.svadhyaya.Retrofit.APIInterface;
import com.example.svadhyaya.RetrofitModel.GetAllPackages;
import com.example.svadhyaya.RetrofitModel.LogOut;
import com.example.svadhyaya.SharedPrefrence.PrefManager;
import com.example.svadhyaya.dashboard.activities.ProfileActivity;
import com.example.svadhyaya.dashboard.adapter.DrawerItemCustomAdapter;
import com.example.svadhyaya.dashboard.model.DataModel;
import com.google.android.material.snackbar.Snackbar;

import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NavigationDrawerFragment extends Fragment  {
    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    Button logout;
    TextView profilename,viewprofile;
    CircleImageView profilepic;
    PrefManager prefManager;
    ProgressBar progressBar;
    APIInterface apiInterface;
    LinearLayout linearLayoutlogout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_navigation_drawer, container, false);
        prefManager=new PrefManager(getContext());
        apiInterface = APIClient.getClient().create(APIInterface.class);
        initilization(view);
        setUpRecyclerView(view);
        viewprofile.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                viewprofile.setTextColor(R.color.red);
                Intent intent=new Intent(getContext(), ProfileActivity.class);
                startActivity(intent);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LogoutFun(prefManager.getWeb_time());
            }
        });
        return view;
    }

    public void LogoutFun(String authkey){
        final ProgressDialog progressDialog = new ProgressDialog(getContext());
        progressDialog.setMessage("Loading...");
        progressDialog.show();
        final LogOut logOut=new LogOut(authkey);
        Call<LogOut> call=apiInterface.Logout(logOut);
        call.enqueue(new Callback<LogOut>() {
            @Override
            public void onResponse(Call<LogOut> call, Response<LogOut> response) {
                System.out.println("response"+response);
                LogOut logOut1 = response.body();
                System.out.println(logOut1.getMessage());
                if (logOut1 !=null && logOut1.getStatus().equals("true")){
                    SnackBar("Successfully Logout");
                    Intent intent=new Intent(getContext(), LoginWithPasswordActivity.class);
                    startActivity(intent);
                }else {
                    SnackBar("Try again please");
                    progressDialog.dismiss();
                }

            }
            @Override
            public void onFailure(Call<LogOut> call, Throwable t) {
                System.out.println("errorss" +t.getMessage());
                SnackBar("Something Wrong");
                progressDialog.dismiss();
            }
        });



    }
    private void setUpRecyclerView(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.drawerList);
        DrawerItemCustomAdapter adapter = new DrawerItemCustomAdapter(getActivity(), DataModel.getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
    public void setUpDrawer(int fragmentId, DrawerLayout drawerLayout, Toolbar toolbar) {
        mDrawerLayout = drawerLayout;
        mDrawerToggle = new ActionBarDrawerToggle(getActivity(), drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
//                getActivity().invalidateOptionsMenu();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
//                getActivity().invalidateOptionsMenu();
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                // Do something of Slide of Drawer
            }
        };
        // this drawer layout is linked with ActionBarDrawerToggle
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        // sync the state of Navigation Drawer with the help of Runnable
        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {
                mDrawerToggle.syncState();
            }
        });
    }
    public void initilization(View view){
        logout=view.findViewById(R.id.logout);
        profilename=view.findViewById(R.id.profilename);
        viewprofile=view.findViewById(R.id.viewprofile);
        profilepic=view.findViewById(R.id.profilepic);
        viewprofile.setClickable(true);
        linearLayoutlogout=view.findViewById(R.id.linearlayoutlogout);
        profilename.setText(prefManager.getUserName());
    }
    public void SnackBar(String msg){
        Snackbar snackbar = Snackbar
                .make(linearLayoutlogout, msg, Snackbar.LENGTH_LONG)
                .setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar1 = Snackbar.make(linearLayoutlogout, "Wrong!", Snackbar.LENGTH_SHORT);
                        snackbar1.show();
                    }
                });
        snackbar.show();
    }
}