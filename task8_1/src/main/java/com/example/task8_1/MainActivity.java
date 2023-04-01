package com.example.task8_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements CounterFragment.SignalSetter {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setSignal(boolean plus) {
        DisplayCounterFragment counterFragment = (DisplayCounterFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_display);
        if (plus) {
            counterFragment.inc();
        } else {
            counterFragment.dec();
        }
    }
}