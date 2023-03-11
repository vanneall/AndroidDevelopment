package com.example.task4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.TextView;

public class Frame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        FrameLayout frameLayout = new FrameLayout(this);
        TextView textView1 = new TextView(this);
        textView1.setText("Текст по умолчанию");
        textView1.setTextSize(getResources().getDimension(R.dimen.textSize));
        frameLayout.addView(textView1);


        ScrollView scrollView = new ScrollView(this);
        ScrollView.LayoutParams layoutParams = new ScrollView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 500, Gravity.CENTER);
        layoutParams.leftMargin = 50;
        layoutParams.bottomMargin = 50;
        layoutParams.gravity = Gravity.BOTTOM;

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        scrollView.setLayoutParams(layoutParams);


        for (int i = 0; i < 20; i++) {
            TextView textView = new TextView(this);
            textView.setText("Текст №" + Integer.toString(i + 1));
            textView.setTextSize(getResources().getDimension(R.dimen.textSize));
            linearLayout.addView(textView);
        }

        scrollView.addView(linearLayout);
        frameLayout.addView(scrollView);
        setContentView(frameLayout);
    }
}