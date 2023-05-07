package com.example.task13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {

    String name ="undefined";
    final static String nameVariableKey = "NAME_VARIABLE";
    TextView nameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        nameView = findViewById(R.id.task1_nameView);
    }

    // сохранение состояния
    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putString(nameVariableKey, name);
        super.onSaveInstanceState(outState);
    }
    // получение ранее сохраненного состояния
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        name = savedInstanceState.getString(nameVariableKey);
        nameView.setText(name);
    }
    public void task1_saveName(View view) {
        // получаем введенное имя
        EditText nameBox = findViewById(R.id.task1_nameBox);
        //  сохраняем его в переменную name
        name = nameBox.getText().toString();
    }
    public void task1_getName(View view) {
        //  выводим сохраненное имя
        nameView.setText(name);
    }
}