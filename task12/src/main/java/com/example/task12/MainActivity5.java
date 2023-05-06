package com.example.task12;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ImageView img = findViewById(R.id.task5_animationView);
        img.setBackgroundResource(R.drawable.rabit_animation);
        AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameAnimation.start();
            }
        });
    }
}