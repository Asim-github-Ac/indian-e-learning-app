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
import com.example.svadhyaya.RetrofitModel.GetAllPackages;
import com.example.svadhyaya.RetrofitModel.PackageParts;
import com.example.svadhyaya.RetrofitModel.SubjectPackage;
import com.example.svadhyaya.dashboard.activities.SubjectActivity;

import java.io.Serializable;
import java.util.List;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.SubjectHolder> {

    private Context context;
    private List<SubjectPackage> getAllPackagesList;
    public SubjectAdapter(Context context,List<SubjectPackage> getAllPackages){
        this.getAllPackagesList=getAllPackages;
        this.context=context;
    }

    @NonNull
    @Override
    public SubjectAdapter.SubjectHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.subjectholderitem,parent,false);
        return new SubjectAdapter.SubjectHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectAdapter.SubjectHolder holder, int position) {
        SubjectPackage getsubjects = getAllPackagesList.get(position);
        String subjectname= getsubjects.getSubject_name();
//       holder.LoadData(subjectname);
        holder.subjecttext.setText(subjectname);
       holder.itemimage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(context, SubjectActivity.class);
               intent.putExtra("pos",String.valueOf(position));
               intent.putExtra("List",(Serializable) getAllPackagesList);
               context.startActivity(intent);

           }
       });

    }

    @Override
    public int getItemCount() {
        return getAllPackagesList.size();
    }
    public class SubjectHolder extends RecyclerView.ViewHolder {
        TextView subjecttext;
        ImageView itemimage;
        ConstraintLayout itemlayout;
        public SubjectHolder(@NonNull View itemView) {
            super(itemView);
            subjecttext=itemView.findViewById(R.id.titleclass);
            itemlayout=itemView.findViewById(R.id.itemcontraints);
            itemimage=itemView.findViewById(R.id.itemclick);
        }
        private void LoadData(String subjecrtname){
            subjecttext.setText(subjecrtname);
        }
    }
}
