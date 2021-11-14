package com.example.svadhyaya.dashboard.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.svadhyaya.Interfaces.OnLiveVideoPass;
import com.example.svadhyaya.R;
import com.example.svadhyaya.RetrofitModel.LiveClassRoom;
import com.example.svadhyaya.dashboard.activities.LessonActivity;
import com.example.svadhyaya.dashboard.activities.LiveVideoWatch;
import com.example.svadhyaya.math.MathFragment;

import java.util.List;

public class LiveLessonAdapter extends RecyclerView.Adapter<LiveLessonAdapter.LiveLessionHolder> {
    private Context context;
    private List<LiveClassRoom.LiveClass2.LiveClassList3> liveLessonList;
    String subjectname,classtitle,liveurl;


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
        subjectname= liveLessonModel.getSubject_name().toString();
        classtitle= liveLessonModel.getClassroom_title().toString();
        liveurl=liveLessonModel.getLive_link().toString();
        holder.teacher_subject.setText(subjectname);
        holder.live_lesson_time.setText( liveLessonModel.getEntry_on().toString());
        holder.live_lesson_topics.setText(classtitle);
        holder.constraintLayoutlive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, LiveVideoWatch.class);
                intent.putExtra("liveurl",liveurl);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return liveLessonList.size();
    }

    public class LiveLessionHolder extends RecyclerView.ViewHolder {
        ConstraintLayout constraintLayoutlive;
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
            constraintLayoutlive=itemView.findViewById(R.id.constrantlayoutloveadp);
        }
    }
}
