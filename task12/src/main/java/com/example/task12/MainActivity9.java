package com.example.task12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }

    public void setButton1(View view){
        MyFragmentDialog2 dialog = new MyFragmentDialog2();
        Bundle args = new Bundle();
        args.putString("button", "кнопка1");
        dialog.setArguments(args);
        dialog.show(getSupportFragmentManager(), "custom");
    }

    public void setButton2(View view){
        MyFragmentDialog2 dialog = new MyFragmentDialog2();
        Bundle args = new Bundle();
        args.putString("button", "кнопка2");
        dialog.setArguments(args);
        dialog.show(getSupportFragmentManager(), "custom");
    }

    public void setButton3(View view){
        MyFragmentDialog2 dialog = new MyFragmentDialog2();
        Bundle args = new Bundle();
        args.putString("button", "кнопка3");
        dialog.setArguments(args);
        dialog.show(getSupportFragmentManager(), "custom");
    }
}