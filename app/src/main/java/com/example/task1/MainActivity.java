package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextTextPersonName);
        button = findViewById(R.id.inputButton);
        button.setOnClickListener(this::onClick);
    }

    public void onClick(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("name", editText.getText().toString());
        startActivity(intent);
    }
}