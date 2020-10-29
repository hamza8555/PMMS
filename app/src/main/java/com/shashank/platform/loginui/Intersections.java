package com.shashank.platform.loginui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class Intersections extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intersections);

        IntersectionsFragment fragment = new IntersectionsFragment();
        FragmentManager manager = getSupportFragmentManager();
        final int commit = manager.beginTransaction().add(R.id.mainLayout, fragment).commit();


        final TextView textView3 = (TextView) findViewById(R.id.textView3);
        final EditText textView47 = (EditText) findViewById(R.id.textView47);
        final EditText textView4 = (EditText) findViewById(R.id.textView4);
        final EditText textView5 = (EditText) findViewById(R.id.textView5);
        final EditText textView6 = (EditText) findViewById(R.id.textView6);
        final EditText textView7 = (EditText) findViewById(R.id.textView7);
        final EditText textView11 = (EditText) findViewById(R.id.textView11);
        final Button button = findViewById(R.id.bbbbutton);
        final Button button1 = findViewById(R.id.bbbutton);






    }
}