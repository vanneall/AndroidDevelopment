package com.example.task12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }

    public void showDialog(View v) {

        MyFragmentDialog dialog = new MyFragmentDialog();
        dialog.show(getSupportFragmentManager(), "custom");
    }
}