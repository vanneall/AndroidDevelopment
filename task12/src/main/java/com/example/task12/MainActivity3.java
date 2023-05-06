package com.example.task12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity3 extends AppCompatActivity {

    VideoView videoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        videoPlayer = findViewById(R.id.task3_videoView);
        videoPlayer.setVideoPath("https://vk.com/video/@vanuuus?z=video431280131_456240500%2Fpl_185224822_-2");
    }
}