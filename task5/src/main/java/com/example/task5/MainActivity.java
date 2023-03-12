package com.example.task5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

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
    }

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