package com.example.svadhyaya.dashboard.adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.svadhyaya.R;
import com.example.svadhyaya.RetrofitModel.ContactUs;
import com.example.svadhyaya.dashboard.activities.MainActivity;
import com.example.svadhyaya.dashboard.fragments.ContactUsFragment;
import com.example.svadhyaya.dashboard.fragments.NavigationDrawerFragment;
import com.example.svadhyaya.dashboard.model.DataModel;
import com.example.svadhyaya.math.MathFragment;

import java.util.List;

public class DrawerItemCustomAdapter extends RecyclerView.Adapter<DrawerItemCustomAdapter.MyViewHolder> {
    private List<DataModel> mDataList;  // = Collections.emptyList();
    private LayoutInflater inflater;
    private Context context;

    public DrawerItemCustomAdapter(Context context, List<DataModel> data) {
        inflater = LayoutInflater.from(context);
        this.mDataList = data;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.drawerlistview, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        DataModel current = mDataList.get(position);
        holder.setData(current, position);

        // click listener on RecyclerView items
      holder.draweritem.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              ((MainActivity) context).onSideMenuClick();

              if (current.getTitle().equals("My Lessons")){
                  Toast.makeText(context, ""+current.getTitle(), Toast.LENGTH_SHORT).show();
              }else  if (current.getTitle().equals("Learning Analysis")){
                  Toast.makeText(context, ""+current.getTitle(), Toast.LENGTH_SHORT).show();
              }else if (current.getTitle().equals("Ask a Questions")){
                  Toast.makeText(context, ""+current.getTitle(), Toast.LENGTH_SHORT).show();
              }else if (current.getTitle().equals("Notification")){
                  Toast.makeText(context, ""+current.getTitle(), Toast.LENGTH_SHORT).show();
              }else if (current.getTitle().equals("Subscribe")){
                  Toast.makeText(context, ""+current.getTitle(), Toast.LENGTH_SHORT).show();
              }else if (current.getTitle().equals("Contactus")){
                  Bundle bundle = new Bundle();
                  bundle.putString("refrence","Contactus" );
                  ContactUsFragment bookFragment = new ContactUsFragment();
                  bookFragment.setArguments(bundle);
                  AppCompatActivity activity = (AppCompatActivity) view.getContext();
                  activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, bookFragment).addToBackStack(null).commit();
              }else if (current.getTitle().equals("Share an App")){
                  Toast.makeText(context, ""+current.getTitle(), Toast.LENGTH_SHORT).show();
              }else if (current.getTitle().equals("Terms & Condition")){
                  Toast.makeText(context, ""+current.getTitle(), Toast.LENGTH_SHORT).show();
              }
          }
      });
    }
    @Override
    public int getItemCount() {
        return mDataList.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView imgView;
        LinearLayout draweritem;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            imgView = (ImageView) itemView.findViewById(R.id.imgIcon);
            draweritem=itemView.findViewById(R.id.drawerList);
        }
        public void setData(DataModel current, int position) {
            this.title.setText(current.getTitle());
            this.imgView.setImageResource(current.getImageId());

        }
    }
}
