package com.example.task8_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ExampleTwo extends AppCompatActivity implements ListFragment.Inter{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_two);
    }

    @Override
    public void setText(String text) {
        ResultFragment resultFragment = (ResultFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_result_example_two);
        if (resultFragment != null && resultFragment.isVisible()){
            ((TextView) resultFragment.getView().findViewById(R.id.message)).setText(text);
        } else {
            Intent intent = new Intent(this, AdditionalActivity.class);
            intent.putExtra("msg", text);
            startActivity(intent);
        }
    }
}