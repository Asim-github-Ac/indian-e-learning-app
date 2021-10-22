package com.example.svadhyaya.dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.svadhyaya.R;

public class VideoView extends AppCompatActivity implements View.OnClickListener {
VideoView videoView;
TextView titletv,descriptiontv;
ImageView likeimg,shareimg;
Button btnnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);
        btnnext.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.nextvideo:
                NextVideo();
            break;

        }

    }
    public void NextVideo(){


    }
    public void initilization(){
        likeimg=findViewById(R.id.livkvideo);
        shareimg=findViewById(R.id.vshare);
        titletv=findViewById(R.id.videotopic);
        descriptiontv=findViewById(R.id.topicdes);
        btnnext=findViewById(R.id.nextvideo);
    }
}