package com.example.task13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserActivity2 extends AppCompatActivity {

    private EditText nameBox;
    private EditText yearBox;
    private Button delButton;

    private DatabaseAdapter adapter;
    private long userId=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user2);

        nameBox = findViewById(R.id.user2_name);
        yearBox = findViewById(R.id.user2_year);
        delButton = findViewById(R.id.user2_deleteButton);
        adapter = new DatabaseAdapter(this);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            userId = extras.getLong("id");
        }
        // если 0, то добавление
        if (userId > 0) {
            // получаем элемент по id из бд
            adapter.open();
            User user = adapter.getUser(userId);
            nameBox.setText(user.getName());
            yearBox.setText(String.valueOf(user.getYear()));
            adapter.close();
        } else {
            // скрываем кнопку удаления
            delButton.setVisibility(View.GONE);
        }
    }

    public void user2_save2(View view){

        String name = nameBox.getText().toString();
        int year = Integer.parseInt(yearBox.getText().toString());
        User user = new User(userId, name, year);

        adapter.open();
        if (userId > 0) {
            adapter.update(user);
        } else {
            adapter.insert(user);
        }
        adapter.close();
        user2_goHome();
    }
    public void user2_delete(View view){

        adapter.open();
        adapter.delete(userId);
        adapter.close();
        user2_goHome();
    }
    private void user2_goHome(){
        // переход к главной activity
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }
}
