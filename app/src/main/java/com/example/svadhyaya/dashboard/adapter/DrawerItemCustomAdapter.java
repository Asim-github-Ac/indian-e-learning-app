package com.example.svadhyaya.dashboard.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.svadhyaya.R;
import com.example.svadhyaya.dashboard.model.DataModel;

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
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, holder.title.getText().toString(), Toast.LENGTH_SHORT).show();
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
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            imgView = (ImageView) itemView.findViewById(R.id.imgIcon);
        }
        public void setData(DataModel current, int position) {
            this.title.setText(current.getTitle());
            this.imgView.setImageResource(current.getImageId());
        }
    }
}
