package com.example.task14;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.xmlpull.v1.XmlPullParser;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        XmlPullParser xpp = getResources().getXml(R.xml.xml);
        UserResourceParser parser = new UserResourceParser();
        if (parser.parse(xpp)) {
            for (User prod : parser.getUsers()) {
                Log.d("XML", prod.toString());
            }
        }
    }
}