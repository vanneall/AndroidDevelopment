package com.example.task13;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity6 extends AppCompatActivity {

    private final static String FILE_NAME = "document.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    private File task6_getExternalPath() {
        return new File(getExternalFilesDir(null), FILE_NAME);
    }
    // сохранение файла
    public void task6_saveText(View view){

        try(FileOutputStream fos = new FileOutputStream(task6_getExternalPath())) {
            EditText textBox = findViewById(R.id.task6_editor);
            String text = textBox.getText().toString();
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    // открытие файла
    public void task6_openText(View view){

        TextView textView = findViewById(R.id.task6_text);
        File file = task6_getExternalPath();
        // если файл не существует, выход из метода
        if(!file.exists()) return;
        try(FileInputStream fin =  new FileInputStream(file)) {
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            textView.setText(text);
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}