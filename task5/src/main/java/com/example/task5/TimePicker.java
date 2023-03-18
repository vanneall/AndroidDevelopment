package com.example.task5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TimePicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        android.widget.TimePicker timePicker = findViewById(R.id.timePicker);
        timePicker.setOnTimeChangedListener(new android.widget.TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(android.widget.TimePicker timePicker, int i, int i1) {
                TextView textView = findViewById(R.id.textViewTimePicker);
                textView.setText("Выбрано: " + Integer.toString(timePicker.getHour()) + ":" + Integer.toString(timePicker.getMinute()));
            }
        });
    }
}