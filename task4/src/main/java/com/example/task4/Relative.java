package com.example.task4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Relative extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setPadding(20,20,20,20);
        TextView textView1 = new TextView(this);
        textView1.setText("Левый верх");
        textView1.setTextSize(getResources().getDimension(R.dimen.textSize));
        TextView textView2 = new TextView(this);
        textView2.setText("Правый верх");
        textView2.setTextSize(getResources().getDimension(R.dimen.textSize));
        TextView textView3 = new TextView(this);
        textView3.setText("Левый низ");
        textView3.setTextSize(getResources().getDimension(R.dimen.textSize));
        TextView textView4 = new TextView(this);
        textView4.setText("Правый низ");
        textView4.setTextSize(getResources().getDimension(R.dimen.textSize));

        RelativeLayout.LayoutParams layoutParams1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams1.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        layoutParams1.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        relativeLayout.addView(textView1, layoutParams1);

        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams2.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        layoutParams2.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        relativeLayout.addView(textView2, layoutParams2);

        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams3.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        layoutParams3.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        relativeLayout.addView(textView3, layoutParams3);

        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams4.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        layoutParams4.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        relativeLayout.addView(textView4, layoutParams4);

        setContentView(relativeLayout);
    }
}