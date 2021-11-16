package com.example.svadhyaya.math.adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.svadhyaya.R;
import com.example.svadhyaya.RetrofitModel.StudyFolderList;
import com.example.svadhyaya.RetrofitModel.StudyMaterialFolder;
import com.example.svadhyaya.RetrofitModel.SubjectPackage;
import com.example.svadhyaya.dashboard.fragments.TopicsFragments;
import com.example.svadhyaya.math.MathFragment;

import java.util.List;

import static com.example.svadhyaya.R.drawable.ic_biology_card;
import static com.example.svadhyaya.R.drawable.ic_calculating;
import static com.example.svadhyaya.R.drawable.ic_chemistry_card;
import static com.example.svadhyaya.R.drawable.ic_math_card;
import static com.example.svadhyaya.R.drawable.ic_physics_card;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.SubjectHolder> {

    private Context context;
    private List<StudyFolderList> getAllPackagesList;
    public SubjectAdapter(Context context,List<StudyFolderList> getAllPackages){
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
        StudyFolderList getsubjects = getAllPackagesList.get(position);
        String subjectname= getsubjects.getFolder_name();
        String folderid= getsubjects.getFolder_id();
//       holder.LoadData(subjectname);
        if (subjectname.equals("Chemistry")){
            holder.subjecttext.setText(subjectname);
            holder.bgimage.setImageResource(ic_chemistry_card);
        }else if(subjectname.equals("Mathematics")){
            holder.subjecttext.setText(subjectname);
            holder.bgimage.setImageResource(ic_math_card);
        }else if (subjectname.equals("Physics")){
            holder.subjecttext.setText(subjectname);
            holder.bgimage.setImageResource(ic_physics_card);
        }
        else {
            holder.subjecttext.setText(subjectname);
            holder.bgimage.setImageResource(ic_biology_card);
        }
       holder.bgimage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Bundle bundle = new Bundle();
               bundle.putString("subj",subjectname );
               bundle.putString("folderid",folderid);
               bundle.putString("subjectid",getsubjects.getSubject_id());
               TopicsFragments bookFragment = new TopicsFragments();
               bookFragment.setArguments(bundle);
               AppCompatActivity activity = (AppCompatActivity) view.getContext();
               activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, bookFragment).addToBackStack(null).commit();
           }
       });

    }

    @Override
    public int getItemCount() {
        return getAllPackagesList.size();
    }
    public class SubjectHolder extends RecyclerView.ViewHolder {
        TextView subjecttext;
        ImageView bgimage;
        ConstraintLayout itemlayout;
        public SubjectHolder(@NonNull View itemView) {
            super(itemView);
            subjecttext=itemView.findViewById(R.id.titleclass);
            itemlayout=itemView.findViewById(R.id.itemcontraints);
            bgimage=itemView.findViewById(R.id.bgimage);
        }
        private void LoadData(String subjecrtname){
            subjecttext.setText(subjecrtname);
        }
    }
}
