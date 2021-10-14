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
import com.example.svadhyaya.math.model.NumberBasedModel;

import java.util.List;

public class NumberBasedAdapter extends RecyclerView.Adapter<NumberBasedAdapter.NumberBasedHolder> {

    private Context context;
    private List<NumberBasedModel> numberBasedList;

    public NumberBasedAdapter(Context context, List<NumberBasedModel> numberBasedList) {
        this.context = context;
        this.numberBasedList = numberBasedList;
    }


    @NonNull
    @Override
    public NumberBasedHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.math_number_based_items,parent,false);
        return new NumberBasedHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NumberBasedHolder holder, int position) {
        NumberBasedModel numberBasedModel = numberBasedList.get(position);

        String title = numberBasedModel.getTitle();
        String lesson = numberBasedModel.getLesson();
        int img = numberBasedModel.getImage();
        int progress = numberBasedModel.getProgress();

        holder.getData(title,lesson,img,progress);
    }

    @Override
    public int getItemCount() {
        return numberBasedList.size();
    }

    public class NumberBasedHolder extends RecyclerView.ViewHolder {
        TextView mTitle,mLesson;
        ProgressBar mProgressBar;
        ImageView mImageView;
        public NumberBasedHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.n_title);
            mLesson = itemView.findViewById(R.id.n_lesson);
            mProgressBar = itemView.findViewById(R.id.n_progress);
            mImageView = itemView.findViewById(R.id.n_image);
        }
        private void getData(String title, String lesson, int image, int progress){
            mTitle.setText(title);
            mLesson.setText(lesson);
            Glide.with(context).load(image).into(mImageView);
            mProgressBar.setProgress(progress);
        }
    }
}
