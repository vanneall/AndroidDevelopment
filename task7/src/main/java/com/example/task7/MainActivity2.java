package com.example.task7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            UserInfo user = bundle.getParcelable("user");
            TextView textViewFName = findViewById(R.id.textViewFName);
            textViewFName.setText(user.getfName());
            TextView textViewLName = findViewById(R.id.textViewLName);
            textViewLName.setText(user.getlName());
            TextView textViewTName = findViewById(R.id.textViewTName);
            textViewTName.setText(user.gettName());
            TextView textViewAge = findViewById(R.id.textViewAge);
            textViewAge.setText(Byte.toString(user.getAge()));
        }
    }
}