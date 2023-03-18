package com.example.task5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText MsgNumberOne;

    EditText MsgNumberTwo;

    EditText editTextMsg;

    TextView getMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MsgNumberOne = findViewById(R.id.MsgNumberOne);
        MsgNumberTwo = findViewById(R.id.MsgNumberTwo);

        editTextMsg = findViewById(R.id.editTextMsg);
        getMsg = findViewById(R.id.getMsg);

        MsgNumberOne.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                MsgNumberTwo.setText(MsgNumberOne.getText());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        CheckBox checkBox1 = findViewById(R.id.checkBox);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        CheckBox checkBox3 = findViewById(R.id.checkBox3);

        checkBox1.setOnCheckedChangeListener(checkedChangeListener);
        checkBox2.setOnCheckedChangeListener(checkedChangeListener);
        checkBox3.setOnCheckedChangeListener(checkedChangeListener);

        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) Toast.makeText(MainActivity.this, "ToggleButton включен", Toast.LENGTH_SHORT).show();
                else Toast.makeText(MainActivity.this, "ToggleButton выключен", Toast.LENGTH_SHORT).show();
            }
        });

        RadioGroup radioGroup = findViewById(R.id.radiogroup);
        radioGroup.setOnCheckedChangeListener(onCheckedChangeListenerRadioGroup);

        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                TextView textView = findViewById(R.id.textViewSeekBar);
                textView.setText("Двигается: " + Integer.toString(seekBar.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                TextView textView = findViewById(R.id.textViewSeekBar);
                textView.setText("Нажатие на: " + Integer.toString(seekBar.getProgress()));
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                TextView textView = findViewById(R.id.textViewSeekBar);
                textView.setText("Концовка на: " + Integer.toString(seekBar.getProgress()));
            }
        });

        Button buttonSwitchToDatePicker = findViewById(R.id.buttonDatePicker);
        buttonSwitchToDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DatePicker.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.buttonTimePicker).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TimePicker.class);
                startActivity(intent);
            }
        });
    }

    CompoundButton.OnCheckedChangeListener checkedChangeListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            TextView textViewCheckBox = findViewById(R.id.textViewCheckBox);
            if (compoundButton.isChecked()) textViewCheckBox.setText(Integer.toString(Integer.parseInt(textViewCheckBox.getText().toString()) + 1));
            else textViewCheckBox.setText(Integer.toString(Integer.parseInt(textViewCheckBox.getText().toString()) - 1));
        }
    };

    RadioGroup.OnCheckedChangeListener onCheckedChangeListenerRadioGroup = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            TextView label = findViewById(R.id.textViewRadioGroup);
            switch (i){
                case R.id.cppRadioButton: {
                    label.setText("Выбран язык: C++");
                    break;
                }
                case R.id.kotlinRadioButton:RadioButton: {
                    label.setText("Выбран язык: Kotlin");
                    break;
                }
                case R.id.javaRadioButton: {
                    label.setText("Выбран язык: Java");
                    break;
                }
                case R.id.pythonRadioButton: {
                    label.setText("Выбран язык: Python");
                    break;
                }
            }
        }
    };

    public void SendMsg(View view){
        getMsg.setText(editTextMsg.getText().toString());
    }


    public void callToast(View view){
        Toast toast = Toast.makeText(this, "Вызван Toast", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP, 1000, 1000);
        toast.show();
    }


    public void callSnackbar(View view){
        Snackbar snackbar = Snackbar.make(view, "Вызван Snackbar", Snackbar.LENGTH_LONG);
        snackbar.setAction("Действие", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Вызвано действие", Toast.LENGTH_LONG).show();
            }
        });
        snackbar.show();
    }

}