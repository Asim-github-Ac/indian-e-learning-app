package com.example.svadhyaya.dashboard.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.svadhyaya.R;
import com.example.svadhyaya.RetrofitModel.PakagesDetails;

import java.util.List;

public class PackageNameAdapter  extends RecyclerView.Adapter<PackageNameAdapter.packViewHolder> {
    Context context;
    private List<PakagesDetails.MorePakData.PackMoreDetails> packMoreDetails;



    public PackageNameAdapter(List<PakagesDetails.MorePakData.PackMoreDetails> packMoreDetailsList, Context context) {
        this.context = context;
        this.packMoreDetails = packMoreDetailsList;
    }

    @NonNull
    @Override
    public PackageNameAdapter.packViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_items,parent,false);
        return new PackageNameAdapter.packViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull PackageNameAdapter.packViewHolder holder, int position) {
        PakagesDetails.MorePakData.PackMoreDetails liveLessonModel = packMoreDetails.get(position);
        holder.packname.setText(liveLessonModel.getEmail_id());

    }

    @Override
    public int getItemCount() {
        return packMoreDetails.size();
    }
    public class packViewHolder extends RecyclerView.ViewHolder {
        TextView packname;
        public packViewHolder(@NonNull View itemView) {
            super(itemView);
             packname = itemView.findViewById(R.id.class_title);

        }
    }
}
