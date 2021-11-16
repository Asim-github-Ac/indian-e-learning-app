package com.example.svadhyaya.dashboard.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.svadhyaya.R;
import com.example.svadhyaya.RetrofitModel.Folder_Lists;

import java.util.ArrayList;
import java.util.List;

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.TopicviewHolder> {
    Context context;
    List<Folder_Lists> folder_lists;
    public TopicAdapter(Context contex, List<Folder_Lists> folder_lists){
        this.context=contex;
        this.folder_lists=folder_lists;
    }
    @NonNull
    @Override
    public TopicAdapter.TopicviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.topic_item,parent,false);
        return new TopicviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopicAdapter.TopicviewHolder holder, int position) {
        Folder_Lists folder_lists1=folder_lists.get(position);
        System.out.println("");
        String topicname= folder_lists1.getFolder_name();
        holder.topictext.setText(topicname);

    }

    @Override
    public int getItemCount() {
        return folder_lists.size();
    }

    public class TopicviewHolder extends RecyclerView.ViewHolder {
        TextView topictext;
        public TopicviewHolder(@NonNull View itemView) {
            super(itemView);
            topictext=itemView.findViewById(R.id.topicname);

        }
    }
}
