package com.example.svadhyaya.dashboard.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.svadhyaya.R;
import com.example.svadhyaya.Retrofit.LiveClassList3;
import com.example.svadhyaya.RetrofitModel.LiveClass2;
import com.example.svadhyaya.RetrofitModel.LiveClassRoom;
import com.example.svadhyaya.dashboard.model.LiveLessonModel;

import java.util.List;

public class LiveLessonAdapter extends RecyclerView.Adapter<LiveLessonAdapter.LiveLessionHolder> {

    private Context context;
    private List<LiveClassRoom.LiveClass2.LiveClassList3> liveLessonList;

    public LiveLessonAdapter(Context context, List<LiveClassRoom.LiveClass2.LiveClassList3> liveLessonList) {
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
        LiveClassRoom.LiveClass2.LiveClassList3 liveLessonModel = liveLessonList.get(position);
        holder.teacher_subject.setText( liveLessonModel.getSubject_name().toString());
        holder.live_lesson_time.setText( liveLessonModel.getEntry_on().toString());
        holder.teacher_subject.setText( liveLessonModel.classroom_title.toString());
        holder.live_lesson_topics.setText(liveLessonModel.classroom_title.toString());



//        Glide.with(context)
//                .load(liveLessonModel.getBackground())
//                .into(holder.backgroundImage);
//
//        Glide.with(context)
//                .load(liveLessonModel.getImage())
//                .into(holder.personImage);
    }

    @Override
    public int getItemCount() {
        return liveLessonList.size();
    }

    public class LiveLessionHolder extends RecyclerView.ViewHolder {

        ImageView backgroundImage,personImage;
        TextView teach_name,live_lesson_time,teacher_subject,live_lesson_topics;


        public LiveLessionHolder(@NonNull View itemView) {
            super(itemView);
            backgroundImage = itemView.findViewById(R.id.live_lesson_background);
            personImage = itemView.findViewById(R.id.teacher_image);
            teach_name=itemView.findViewById(R.id.teacher_name);
            live_lesson_time=itemView.findViewById(R.id.live_lesson_time);
            teacher_subject=itemView.findViewById(R.id.teacher_subject);
            live_lesson_topics=itemView.findViewById(R.id.live_lesson_topics);
        }
    }
}
