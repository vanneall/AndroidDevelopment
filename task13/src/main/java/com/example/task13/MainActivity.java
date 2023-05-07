package com.example.task13;

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

    public void task1(View view) {
        Intent intent = new Intent(this, MainActivity1.class);
        startActivity(intent);
    }

    public void task2(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void task4(View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void task5(View view) {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }

    public void task6(View view) {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }

    public void task7(View view) {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }

    public void task8(View view) {
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }

    public void task9(View view) {
        Intent intent = new Intent(this, MainActivity9.class);
        startActivity(intent);
    }

    public void task10(View view) {
        Intent intent = new Intent(this, MainActivity10.class);
        startActivity(intent);
    }

    public void task11(View view) {
        Intent intent = new Intent(this, MainActivity11.class);
        startActivity(intent);
    }

    public void task12(View view) {
        Intent intent = new Intent(this, MainActivity12.class);
        startActivity(intent);
    }

    public void task13(View view) {
        Intent intent = new Intent(this, MainActivity13.class);
        startActivity(intent);
    }

}