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
import com.example.svadhyaya.math.model.ProportionsModel;

import java.util.List;

public class ProportionsAdapter extends RecyclerView.Adapter<ProportionsAdapter.ProportionHolder> {

    private Context context;
    private List<ProportionsModel> proportionsList;

    public ProportionsAdapter(Context context, List<ProportionsModel> proportionsList) {
        this.context = context;
        this.proportionsList = proportionsList;
    }

    @NonNull
    @Override
    public ProportionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.math_proportions_items,parent,false);
        return new ProportionHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProportionHolder holder, int position) {
        ProportionsModel proportionsModel = proportionsList.get(position);

        String title = proportionsModel.getTitle();
        String lesson = proportionsModel.getLesson();
        int img = proportionsModel.getImage();
        int progress = proportionsModel.getProgress();

        holder.getData(title,lesson,img,progress);
    }

    @Override
    public int getItemCount() {
        return proportionsList.size();
    }

    public class ProportionHolder extends RecyclerView.ViewHolder {

        TextView mTitle,mLesson;
        ProgressBar mProgressBar;
        ImageView mImageView;

        public ProportionHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.p_title);
            mLesson = itemView.findViewById(R.id.p_lesson);
            mProgressBar = itemView.findViewById(R.id.p_progress);
            mImageView = itemView.findViewById(R.id.p_image);
        }
        private void getData(String title, String lesson, int image, int progress){
            mTitle.setText(title);
            mLesson.setText(lesson);
            Glide.with(context).load(image).into(mImageView);
            mProgressBar.setProgress(progress);
        }
    }
}
