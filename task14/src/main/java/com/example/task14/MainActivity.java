package com.example.task14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void task1(View view){
        Intent intent = new Intent(this, MainActivity1.class);
        startActivity(intent);
    }

    public void task2(View view){
        Intent intent = new Intent(this, MainActivity2_8.class);
        startActivity(intent);
    }

    public void task10(View view){
        Intent intent = new Intent(this, MainActivity10.class);
        startActivity(intent);
    }

    public void task11(View view){
        Intent intent = new Intent(this, MainActivity11.class);
        startActivity(intent);
    }
}