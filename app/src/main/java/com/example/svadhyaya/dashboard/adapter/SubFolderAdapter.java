package com.example.svadhyaya.dashboard.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.svadhyaya.R;
import com.example.svadhyaya.RetrofitModel.Folder_Lists;
import com.example.svadhyaya.RetrofitModel.SubFolderdata;
import com.example.svadhyaya.RetrofitModel.Subfiles;
import com.example.svadhyaya.dashboard.activities.LiveVideoWatch;

import java.util.List;

public class SubFolderAdapter extends RecyclerView.Adapter<SubFolderAdapter.SubfolderHolder> {
    Context context;
    List<Subfiles> subfiles;
    public  SubFolderAdapter(Context context,List<Subfiles> subfiles1){
        this.context=context;
        this.subfiles=subfiles1;
    }
    @NonNull
    @Override
    public SubFolderAdapter.SubfolderHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.topics_items,parent,false);
        return new SubFolderAdapter.SubfolderHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubFolderAdapter.SubfolderHolder holder, int position) {
        Subfiles subfiles1=subfiles.get(position);
        holder.textView.setText(subfiles1.getDocument_name());
        holder.cardwatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, LiveVideoWatch.class);
                intent.putExtra("liveurl",subfiles1.getEmbedlink());
                context.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return subfiles.size();
    }

    public class SubfolderHolder extends RecyclerView.ViewHolder {
        TextView textView;
        CardView cardwatch;
        public SubfolderHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.p_title);
            cardwatch=itemView.findViewById(R.id.cardvideo);

        }
    }
}
