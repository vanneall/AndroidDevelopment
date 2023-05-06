package com.example.task12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        ImageView img = findViewById(R.id.animationView);
        img.setImageResource(R.drawable.img_1);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.common_animation);
        img.startAnimation(animation);
    }

    public void click(View v) {
        Intent i=new Intent(this, MediaService.class);
        if (v.getId()==R.id.task6_playButton) {
            startService(i);
        }
        else {
            stopService(i);
        }
    }
}