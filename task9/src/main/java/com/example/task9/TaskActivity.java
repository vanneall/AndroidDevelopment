package com.example.task9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;

public class TaskActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        intent = getIntent();

        FragmentManager fragmentManager = getSupportFragmentManager();
        switch (intent.getIntExtra("TASK", -1)) {
            case 0: {
                fragmentManager.beginTransaction().add(R.id.container, Task1Fragment.class, null).commit();
                break;
            }
            case 1: {
                fragmentManager.beginTransaction().add(R.id.container, Task2Fragment.class, null).commit();
                break;
            }
            case 2: {
                fragmentManager.beginTransaction().add(R.id.container, Task3Fragment.class, null).commit();
                break;
            }
            case 3:{
                fragmentManager.beginTransaction().add(R.id.container, Task4Fragment.class, null).commit();
                break;
            }
            case 4: {
                fragmentManager.beginTransaction().add(R.id.container, Task5Fragment.class, null).commit();
                break;
            }
            case 5:
            case 6:{
                fragmentManager.beginTransaction().add(R.id.container, Task6_7Fragment.class, null).commit();
                break;
            }
            case 7:{
                fragmentManager.beginTransaction().add(R.id.container, Task8Fragment.class, null).commit();
                break;
            }
        }


    }
}