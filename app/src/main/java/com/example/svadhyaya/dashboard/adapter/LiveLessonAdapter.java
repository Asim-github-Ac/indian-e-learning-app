package com.example.svadhyaya.dashboard.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.svadhyaya.R;
import com.example.svadhyaya.dashboard.model.LiveLessonModel;

import java.util.List;

public class LiveLessonAdapter extends RecyclerView.Adapter<LiveLessonAdapter.LiveLessionHolder> {

    private Context context;
    private List<LiveLessonModel> liveLessonList;

    public LiveLessonAdapter(Context context, List<LiveLessonModel> liveLessonList) {
        this.context = context;
        this.liveLessonList = liveLessonList;
    }

    @NonNull
    @Override
    public LiveLessionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.live_lessons_item,parent,false);
        return new LiveLessionHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LiveLessionHolder holder, int position) {
        LiveLessonModel liveLessonModel = liveLessonList.get(position);

        Glide.with(context)
                .load(liveLessonModel.getBackground())
                .into(holder.backgroundImage);

        Glide.with(context)
                .load(liveLessonModel.getImage())
                .into(holder.personImage);
    }

    @Override
    public int getItemCount() {
        return liveLessonList.size();
    }

    public class LiveLessionHolder extends RecyclerView.ViewHolder {

        ImageView backgroundImage,personImage;

        public LiveLessionHolder(@NonNull View itemView) {
            super(itemView);
            backgroundImage = itemView.findViewById(R.id.live_lesson_background);
            personImage = itemView.findViewById(R.id.teacher_image);
        }
    }
}
