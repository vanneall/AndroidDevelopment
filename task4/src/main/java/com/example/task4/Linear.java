package com.example.task4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Linear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setPadding(10,10,10,10);
        linearLayout.setWeightSum(4);


        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 0, 2);
        layoutParams.gravity = Gravity.CENTER;

        EditText editText = new EditText(this);
        editText.setLayoutParams(layoutParams);
        editText.setHint("Какое-то сообщение");
        editText.setGravity(Gravity.BOTTOM);
        linearLayout.addView(editText);

        TextView textView = new TextView(this);
        textView.setText("Какой-то текст");
        textView.setBackgroundColor(R.color.teal_200);
        textView.setTextSize(18);
        layoutParams.weight = 2;
        layoutParams.width = LinearLayout.LayoutParams.MATCH_PARENT;
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);



        LinearLayout linearLayoutWithButtons = new LinearLayout(this);
        linearLayoutWithButtons.setOrientation(LinearLayout.HORIZONTAL);
        Button switchToRelativeLayout = new Button(this);
        switchToRelativeLayout.setId(1);
        Button switchToTableLayout = new Button(this);
        switchToTableLayout.setId(2);
        Button switchToFrameLayout = new Button(this);
        switchToFrameLayout.setId(3);
        Button switchToGridLayout = new Button(this);
        switchToGridLayout.setId(4);
        Button switchToSomeLayout = new Button(this);
        switchToSomeLayout.setId(5);


        switchToRelativeLayout.setText(getResources().getString(R.string.RelativeLayout));
        switchToTableLayout.setText(getResources().getString(R.string.TableLayout));
        switchToFrameLayout.setText(getResources().getString(R.string.FrameLayout));
        switchToGridLayout.setText(getResources().getString(R.string.GridLayout));
        switchToSomeLayout.setText(getResources().getString(R.string.ScrollView));


        switchToRelativeLayout.setOnClickListener(this::SwitchButton);
        switchToTableLayout.setOnClickListener(this::SwitchButton);
        switchToFrameLayout.setOnClickListener(this::SwitchButton);
        switchToGridLayout.setOnClickListener(this::SwitchButton);
        switchToSomeLayout.setOnClickListener(this::SwitchButton);


        linearLayoutWithButtons.addView(switchToRelativeLayout);
        linearLayoutWithButtons.addView(switchToTableLayout);
        linearLayoutWithButtons.addView(switchToFrameLayout);
        linearLayoutWithButtons.addView(switchToGridLayout);
        linearLayoutWithButtons.addView(switchToSomeLayout);


        linearLayoutWithButtons.setWeightSum(1);
        linearLayout.addView(linearLayoutWithButtons);


        setContentView(linearLayout);

    }

    public void SwitchButton(View view){
        Intent intent;
        switch (view.getId()){
            case 1: {
                intent = new Intent(this, Relative.class);
                startActivity(intent);
                break;
            }
            case 2: {
                intent = new Intent(this, Table.class);
                startActivity(intent);
                break;
            }
            case 3: {
                intent = new Intent(this, Frame.class);
                startActivity(intent);
                break;
            }
            case 4: {
                intent = new Intent(this, Grid.class);
                startActivity(intent);
                break;
            }
            case 5: {
                intent = new Intent("its_my_action");
                startActivity(intent);
                break;
            }
        }
    }
}