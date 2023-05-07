package com.example.task13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }

    public void task7_onClick(View view){
        SQLiteDatabase db = getBaseContext().openOrCreateDatabase("app.db", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS users (name TEXT, age INTEGER, UNIQUE(name))");
        db.execSQL("INSERT OR IGNORE INTO users VALUES ('Tom Smith', 23), ('John Dow', 31);");

        Cursor query = db.rawQuery("SELECT * FROM users;", null);
        TextView textView = findViewById(R.id.task7_textView);
        textView.setText("");
        while(query.moveToNext()){
            String name = query.getString(0);
            int age = query.getInt(1);
            textView.append("Name: " + name + " Age: " + age + "\n");
        }
        query.close();
        db.close();
    }
}