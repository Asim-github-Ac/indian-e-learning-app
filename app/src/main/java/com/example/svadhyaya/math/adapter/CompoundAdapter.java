package com.example.svadhyaya.math.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.svadhyaya.R;
import com.example.svadhyaya.math.model.CompoundModel;


import java.util.List;

public class CompoundAdapter extends RecyclerView.Adapter<CompoundAdapter.CompoundHolder> {

    private Context context;
    private List<CompoundModel> compoundList;

    public CompoundAdapter(Context context, List<CompoundModel> compoundList) {
        this.context = context;
        this.compoundList = compoundList;
    }

    @NonNull
    @Override
    public CompoundHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.math_compound_item,parent,false);
        return new CompoundHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CompoundHolder holder, int position) {
        CompoundModel compoundModel = compoundList.get(position);

        String title = compoundModel.getTitle();
        String lesson = compoundModel.getLesson();
        int img = compoundModel.getImage();
        int progress = compoundModel.getProgress();

        holder.getData(title,lesson,img,progress);
    }

    @Override
    public int getItemCount() {
        return compoundList.size();
    }

    public class CompoundHolder extends RecyclerView.ViewHolder {
        TextView mTitle,mLesson;
        ProgressBar mProgressBar;
        ImageView mImageView;
        public CompoundHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.c_title);
            mLesson = itemView.findViewById(R.id.c_lesson);
            mProgressBar = itemView.findViewById(R.id.c_progress);
            mImageView = itemView.findViewById(R.id.c_image);
        }
        private void getData(String title, String lesson, int image, int progress){
            mTitle.setText(title);
            mLesson.setText(lesson);
            Glide.with(context).load(image).into(mImageView);
            mProgressBar.setProgress(progress);
        }
    }
}
