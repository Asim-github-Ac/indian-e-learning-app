package com.example.svadhyaya.dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.svadhyaya.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class LessonActivity   extends YouTubeBaseActivity
        implements YouTubePlayer.OnInitializedListener {
    private String GOOGLE_API_KEY = "AIzaSyBZVbNSsdQZCX_yWFCHPQ_fQMcK4xf9hDk";
    private String YOUTUBE_VIDEO_ID = "EknEIzswvC0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        youTubePlayerView.initialize(String.valueOf(R.string.googleapi), this);

    }
    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
        Toast.makeText(this, "Initialized Youtube Player successfully", Toast.LENGTH_LONG).show();
        youTubePlayer.setPlayerStateChangeListener(playerStateChangeListener);
        youTubePlayer.setPlaybackEventListener(playbackEventListener);
        if(!wasRestored) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID);
        }
    }
    private YouTubePlayer.PlaybackEventListener playbackEventListener = new YouTubePlayer.PlaybackEventListener() {
        @Override
        public void onPlaying() {
            Toast.makeText(LessonActivity.this,"Good, video is playing ok", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onPaused() {
            Toast.makeText(LessonActivity.this,"Video has paused", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onStopped() {

        }

        @Override
        public void onBuffering(boolean b) {

        }

        @Override
        public void onSeekTo(int i) {

        }
    };

    YouTubePlayer.PlayerStateChangeListener playerStateChangeListener = new YouTubePlayer.PlayerStateChangeListener() {
        @Override
        public void onLoading() {

        }

        @Override
        public void onLoaded(String s) {

        }

        @Override
        public void onAdStarted() {
            Toast.makeText(LessonActivity.this,"Click Ad now, make the video creator rich!", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onVideoStarted() {
            Toast.makeText(LessonActivity.this,"Video has started!", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onVideoEnded() {
            Toast.makeText(LessonActivity.this,"Thanks for watching!", Toast.LENGTH_LONG).show();

        }

        @Override
        public void onError(YouTubePlayer.ErrorReason errorReason) {

        }
    };

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "Failed to Initialize Youtube Player", Toast.LENGTH_LONG).show();
    }
}