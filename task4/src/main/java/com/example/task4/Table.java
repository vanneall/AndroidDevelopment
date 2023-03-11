package com.example.task4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Table extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_table);


        TableLayout tableLayout = new TableLayout(this);

        TableRow tableRow1 = new TableRow(this);

        TextView emailText = new TextView(this);
        emailText.setText("Почта: ");
        emailText.setTextSize(getResources().getDimension(R.dimen.textSize));
        tableRow1.addView(emailText, new TableRow.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));

        EditText emailEdit = new EditText(this);
        emailEdit.setTextSize(getResources().getDimension(R.dimen.textSize));
        emailEdit.setHint(EditText.AUTOFILL_HINT_EMAIL_ADDRESS);
        emailEdit.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        tableRow1.addView(emailEdit, new TableRow.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));

        tableLayout.addView(tableRow1);

        TableRow tableRow2 = new TableRow(this);
        Button button = new Button(this);
        button.setText("Совершенно пустая кнопка");
        //button.setTextSize(getResources().getDimension(R.dimen.textSize));
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.span = 2;
        tableRow2.addView(button, layoutParams);

        tableLayout.addView(tableRow2);
        setContentView(tableLayout);


    }
}