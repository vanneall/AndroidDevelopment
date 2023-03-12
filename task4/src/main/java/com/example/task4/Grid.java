package com.example.task4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

public class Grid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_grid);
        GridLayout gridLayout = new GridLayout(this);

        gridLayout.setRowCount(3);
        gridLayout.setColumnCount(3);

        for (int i = 1; i <= gridLayout.getColumnCount(); i++) {
            Button button = new Button(this);
            button.setTextSize(getResources().getDimension(R.dimen.textSize));
            button.setText(Integer.toString(3 - i + 1));

            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams(GridLayout.spec(0), GridLayout.spec(3 - i));
            button.setLayoutParams(layoutParams);
            gridLayout.addView(button);
        }

        Button button4 = new Button(this);
        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams(GridLayout.spec(1),  GridLayout.spec(0,2));
        layoutParams.width = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 180, getResources().getDisplayMetrics());
        button4.setTextSize(getResources().getDimension(R.dimen.textSize));
        button4.setText("4");
        gridLayout.addView(button4, layoutParams);

        Button button5 = new Button(this);
        GridLayout.LayoutParams layoutParams0 = new GridLayout.LayoutParams(GridLayout.spec(1, 2), GridLayout.spec(2));
        layoutParams0.height = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 100, getResources().getDisplayMetrics());
        layoutParams0.leftMargin = 100;
        layoutParams0.topMargin = 100;
        button5.setTextSize(getResources().getDimension(R.dimen.textSize));
        button5.setText("5");
        gridLayout.addView(button5, layoutParams0);

        Button button6 = new Button(this);
        GridLayout.LayoutParams layoutParams1 = new GridLayout.LayoutParams(GridLayout.spec(2), GridLayout.spec(0));
        button6.setTextSize(getResources().getDimension(R.dimen.textSize));
        button6.setText("6");
        gridLayout.addView(button6, layoutParams1);

        Button button7 = new Button(this);
        button7.setTextSize(getResources().getDimension(R.dimen.textSize));
        button7.setText("7");
        gridLayout.addView(button7);
        setContentView(gridLayout);

    }
}