package com.example.task10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        menu.add("Изменить textView");
        menu.add(1,1,0,"Синий");
        menu.add(1,2,1,"Фиолетовый");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getTitle().toString()) {
            case "Вызвать toast":
                Toast.makeText(this, "Вызван toast", Toast.LENGTH_SHORT).show();
                break;
            case "Подгруппа 0":
                break;
            case "Черный":
                ((TextView)findViewById(R.id.my_textView)).setTextColor(getResources().getColor(R.color.black));
                break;
            case "Красный":
                ((TextView)findViewById(R.id.my_textView)).setTextColor(getResources().getColor(R.color.red));
                break;
            case "Изменить textView":
                ((TextView)findViewById(R.id.my_textView2)).setText("Новый текст");
                break;
            case "Синий":
                ((TextView)findViewById(R.id.my_textView2)).setTextColor(getResources().getColor(R.color.blue));
                break;
            case "Фиолетовый":
                ((TextView)findViewById(R.id.my_textView2)).setTextColor(getResources().getColor(R.color.violet));
                break;
        }
        return true;
    }
}