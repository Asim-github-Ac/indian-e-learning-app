package com.example.svadhyaya.math.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.svadhyaya.R;
import com.example.svadhyaya.RetrofitModel.SubjectPackage;

import java.util.List;

public class SubjectDetailsAdapter extends RecyclerView.Adapter<SubjectDetailsAdapter.SubjectDetailsHolder> {
    List<SubjectPackage> packagePartsList;
    Context context;
    String newpos;
    public SubjectDetailsAdapter(Context context,List<SubjectPackage> getAllPackages,String newpos){
        this.packagePartsList=getAllPackages;
        this.context=context;
        this.newpos=newpos;
    }
    @NonNull
    @Override
    public SubjectDetailsAdapter.SubjectDetailsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.subjectdetails,parent,false);
        return new SubjectDetailsAdapter.SubjectDetailsHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull SubjectDetailsAdapter.SubjectDetailsHolder holder, int position) {
        SubjectPackage getsubjects = packagePartsList.get(Integer.parseInt(newpos));
        String subjectname= getsubjects.getSubject_name();
        holder.subjecttext.setText(subjectname);
        holder.itemimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    @Override
    public int getItemCount() {
        return packagePartsList.size();
    }
    public class SubjectDetailsHolder extends RecyclerView.ViewHolder {
        TextView subjecttext;
        ImageView itemimage;
        ConstraintLayout itemlayout;
        public SubjectDetailsHolder(@NonNull View itemView) {
            super(itemView);
            subjecttext=itemView.findViewById(R.id.titleclass);
            itemlayout=itemView.findViewById(R.id.itemcontraints);
            itemimage=itemView.findViewById(R.id.itemclick);
        }
    }
}
