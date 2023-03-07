package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LinearActivity extends AppCompatActivity {

    EditText editText;

    Button button;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        editText = findViewById(R.id.editTextTextPersonNameLinearLayout);
        button = findViewById(R.id.buttonLinearLayout);
        textView = findViewById(R.id.textViewLinearLayout);
        button.setOnClickListener(onClickListener);


        //Создание разметки программно
        /*
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);


        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.weight = 1;

        EditText editText = new EditText(this);
        editText.setHint("Имя");
        editText.setLayoutParams(layoutParams);

        layoutParams.setMargins(10, 10, 10, 10); //Установка внешних отступов через параметры макета
        editText.setPadding(10, 10, 10, 10); //Установка утренних отступов через view-компонент

        int valueInDP = 60;
        int valueInPX = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, valueInDP, getResources().getDisplayMetrics());

        Button button = new Button(this);
        button.setText("Кнопка");
        button.setLayoutParams(layoutParams);

        linearLayout.addView(editText);
        linearLayout.addView(button);

        setContentView(linearLayout);
        */

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            textView.setText("Привет, " + editText.getText().toString());
        }
    };
}