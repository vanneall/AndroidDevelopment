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
        menu.add("Открыть подгруппу0");
        menu.add("Открыть подгруппу1");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.call_toast:
                Toast.makeText(this, "Вызван toast", Toast.LENGTH_SHORT).show();
                break;
            case R.id.edit_text:
                ((TextView)findViewById(R.id.my_textView)).setText("Новый текст");
                break;
        }
        return true;
    }
}