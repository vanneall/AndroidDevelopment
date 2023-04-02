package com.example.task9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] tasks = {"Задание 1", "Задание 2", "Задание 3", "Задание 4", "Задание 5", "Задание 6",
            "Задание 7", "Задание 8", "Задание 9", "Задание 10", "Задание 11", "Задание 12",
            "Задание 13", "Задание 14", "Задание 15"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listViewTasks = findViewById(R.id.list_view_all_tasks);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tasks);
        listViewTasks.setAdapter(adapter);
        listViewTasks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, TaskActivity.class);
                intent.putExtra("TASK", i);
                startActivity(intent);
            }
        });
    }

}