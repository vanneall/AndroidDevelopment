package com.example.task8_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MainMenuFragment.IndexGetter{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void sendIndex(int index) {
        Intent intent;
        switch (index) {
            case 0: {
                intent = new Intent(MainActivity.this, ExampleOne.class);
                startActivity(intent);
                break;
            }
            case 1: {
                intent = new Intent(MainActivity.this, ExampleTwo.class);
                startActivity(intent);
                break;
            }
        }
    }

}