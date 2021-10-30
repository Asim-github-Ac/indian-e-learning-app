package com.example.svadhyaya.dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.svadhyaya.R;

public class LiveVideoWatch extends AppCompatActivity implements View.OnClickListener {
    VideoView videoView;
    String url;
    TextView titletv,descriptiontv;
    ImageView likeimg,shareimg;
    Button btnnext;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_video_watch);
        progressDialog = new ProgressDialog(this);
        initilization();
        Intent intent=getIntent();
        url= intent.getStringExtra("liveurl");
        System.out.println("url___________"+url);
        PlayVideo(url);
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
        videoView=findViewById(R.id.b_video_library1);
    }
    public void PlayVideo(String url){
        Uri uri = Uri.parse(url);
        // sets the resource from the
        // videoUrl to the videoView
        videoView.setVideoURI(uri);
        // creating object of
        // media controller class
        MediaController mediaController = new MediaController(this);
        // sets the anchor view
        // anchor view for the videoView
        mediaController.setAnchorView(videoView);
        // sets the media player to the videoView
        mediaController.setMediaPlayer(videoView);
        // sets the media controller to the videoView
        videoView.setMediaController(mediaController);
        // starts the video
        videoView.start();
    }
}