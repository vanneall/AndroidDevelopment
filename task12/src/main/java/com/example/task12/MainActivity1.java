package com.example.task12;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity1 extends AppCompatActivity {
    VideoView videoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        videoPlayer = findViewById(R.id.task1_videoView);
        Uri myVideoUri= Uri.parse( "android.resource://" + getPackageName() + "/" + R.raw.dante);
        videoPlayer.setVideoURI(myVideoUri);
    }


    public void task1_play(View view){
        videoPlayer.start();
    }
    public void task1_pause(View view){
        videoPlayer.pause();
    }
    public void task1_stop(View view){
        videoPlayer.stopPlayback();
        videoPlayer.resume();
    }
}