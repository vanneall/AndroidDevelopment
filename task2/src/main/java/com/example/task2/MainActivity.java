package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String TAG = "Жизненный цикл";
    private TextView mInfoTextView;
    TextView ScoreText;
    static final String SOCCER_SCORE = "soccer_score";
    public int mCurrentScore=0;

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt(SOCCER_SCORE,mCurrentScore);
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScoreText = findViewById(R.id.myTextView);
        mInfoTextView = findViewById(R.id.textViewInfo);
        if(savedInstanceState!=null){
            mCurrentScore = savedInstanceState.getInt(SOCCER_SCORE);
            ScoreText.setText(String.valueOf(mCurrentScore));
        }
        Toast.makeText(this, "onCreate()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onCreate()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStart()");

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onDestroy()");
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonTouchMe:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                    mInfoTextView.setText("Ваша версия SKD: " + String.valueOf(Build.VERSION.SDK_INT));
                }
                break;
            case R.id.buttonExit:
                finish();
                break;
            case R.id.PlusScore:
                mCurrentScore+=1;
                ScoreText.setText(String.valueOf(mCurrentScore));
                break;
            case R.id.MinusScore:
                mCurrentScore--;
                ScoreText.setText(String.valueOf(mCurrentScore));
                break;
            default:
                break;
        }
    }
}