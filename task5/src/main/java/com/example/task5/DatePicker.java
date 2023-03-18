package com.example.task5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DatePicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        android.widget.DatePicker datePicker = findViewById(R.id.datePicker);
        datePicker.setOnDateChangedListener(new android.widget.DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(android.widget.DatePicker datePicker, int i, int i1, int i2) {
                TextView textView = findViewById(R.id.textViewDatePicker);
                textView.setText("Выбрано: " + Integer.toString(datePicker.getDayOfMonth()) + "/" + Integer.toString(datePicker.getMonth() + 1) + "/" + Integer.toString(datePicker.getYear() + 1));
            }
        });
    }
}