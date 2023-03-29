package com.example.task7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.button:{
                intent = new Intent();
                UserInfo user = new UserInfo(getResources().getString(R.string.ready_fname), getResources().getString(R.string.ready_sname),
                        getResources().getString(R.string.ready_tname), Byte.parseByte(getResources().getString(R.string.ready_age)));
                intent.putExtra("user", user);
                setResult(RESULT_OK, intent);
                finish();
            }
            case R.id.button2: {
                intent = new Intent(this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
                break;
            }
            case R.id.button3: {
                intent = new Intent(this, MainActivity2.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
                break;
            }
        }
    }


}