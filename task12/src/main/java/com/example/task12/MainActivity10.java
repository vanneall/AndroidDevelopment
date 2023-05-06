package com.example.task12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity10 extends AppCompatActivity implements MyFragmentDialog2.Editable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
    }


    public void setButton10(View view){
        MyFragmentDialog2 dialog = new MyFragmentDialog2();
        Bundle args = new Bundle();
        args.putString("button", "кнопка1");
        dialog.setArguments(args);
        dialog.show(getSupportFragmentManager(), "custom");
    }

    public void setButton21(View view){
        MyFragmentDialog2 dialog = new MyFragmentDialog2();
        Bundle args = new Bundle();
        args.putString("button", "кнопка2");
        dialog.setArguments(args);
        dialog.show(getSupportFragmentManager(), "custom");
    }

    public void setButton31(View view){
        MyFragmentDialog2 dialog = new MyFragmentDialog2();
        Bundle args = new Bundle();
        args.putString("button", "кнопка3");
        dialog.setArguments(args);
        dialog.show(getSupportFragmentManager(), "custom");
    }

    @Override
    public void edit(String name) {
        ((TextView)findViewById(R.id.textView)).setText(name);
    }
}