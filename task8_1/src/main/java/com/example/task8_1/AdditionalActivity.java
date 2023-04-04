package com.example.task8_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class AdditionalActivity extends AppCompatActivity {

    String item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }
        setContentView(R.layout.activity_additional);
        if (getIntent().getExtras() != null)
            item = getIntent().getExtras().getString("msg");
    }

    @Override
    protected void onResume() {
        super.onResume();
        ResultFragment fragment = (ResultFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_result_example_two);
        if (fragment != null) {
            ((TextView) fragment.getView().findViewById(R.id.message)).setText(item);
        }
    }
}