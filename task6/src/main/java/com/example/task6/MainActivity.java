package com.example.task6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextGardens;
    EditText editTextFlowers;

    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult = findViewById(R.id.textViewResult);
        editTextGardens = findViewById(R.id.editTextGardens);
        editTextFlowers = findViewById(R.id.editTextFlowers);
        TextView textView = findViewById(R.id.textViewTypeFlowers);
        String[] types = getResources().getStringArray(R.array.type_flowers);
        StringBuilder res = new StringBuilder();
        for (String flower : types){
            res.append(flower).append(" ");
        }
        textView.setText(res);
    }

    public void onClick(View view) {
        int countGardens = Integer.parseInt(editTextGardens.getText().toString());
        int countFlowers = Integer.parseInt(editTextFlowers.getText().toString());
        String gardens = Integer.toString(countGardens) + " " + getResources().getQuantityString(R.plurals.gardens, countGardens);
        String flowers = Integer.toString(countFlowers) + " " + getResources().getQuantityString(R.plurals.flowers, countFlowers);
        textViewResult.setText(getResources().getString(R.string.result_text, gardens, flowers));
    }

}