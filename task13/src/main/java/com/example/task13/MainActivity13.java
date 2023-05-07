package com.example.task13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity13 extends AppCompatActivity {

    private ListView userList;
    ArrayAdapter<User> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        userList = findViewById(R.id.list);

        userList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                User user = arrayAdapter.getItem(position);
                if (user != null) {
                    Intent intent = new Intent(getApplicationContext(), UserActivity.class);
                    intent.putExtra("id", user.getId());
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        DatabaseAdapter adapter = new DatabaseAdapter(this);
        adapter.open();

        List<User> users = adapter.getUsers();

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, users);
        userList.setAdapter(arrayAdapter);
        adapter.close();
    }

    // по нажатию на кнопку запускаем UserActivity для добавления данных
    public void task13_add(View view) {
        Intent intent = new Intent(this, UserActivity2.class);
        startActivity(intent);
    }
}