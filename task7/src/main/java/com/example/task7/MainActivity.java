package com.example.task7;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    UserInfo user;

    EditText editTextFName;
    EditText editTextLName;
    EditText editTextTName;
    EditText editTextAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextFName = findViewById(R.id.editTextFName);
        editTextLName = findViewById(R.id.editTextLName);
        editTextTName = findViewById(R.id.editTextTName);
        editTextAge = findViewById(R.id.editTextAge);
    }

    public void onClickSwitch(View view) {
        switch (view.getId()) {
            case R.id.buttonSwitch: {
                Intent intent = new Intent(this, MainActivity2.class);

                byte age;
                if (editTextAge.getText().toString().equals("")) age = -1;
                else age = Byte.parseByte(editTextAge.getText().toString());
                user = new UserInfo(editTextFName.getText().toString(), editTextLName.getText().toString(),
                        editTextTName.getText().toString(), age);
                intent.putExtra("user", user);
                startActivity(intent);
                break;
            }
            case R.id.buttonPeek: {
                Intent intent = new Intent(this, MainActivity3.class);
                mStartForResult.launch(intent);
                break;
            }
        }
    }

    ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Intent data = result.getData();
                    if (data != null) {
                        UserInfo copyUser = data.getParcelableExtra("user");
                        editTextFName.setText(copyUser.getfName());
                        editTextLName.setText(copyUser.getlName());
                        editTextTName.setText(copyUser.gettName());
                        editTextAge.setText(Byte.toString(copyUser.getAge()));
                    }
                }
            });

}