package com.shashank.platform.loginui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class TabActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);


        ViewPager vp = findViewById(R.id.viewpager);
        PagerAdapter pA = new PageAdapter(getSupportFragmentManager());
        vp.setAdapter(pA);
        TabLayout tL = findViewById(R.id.tabs);
        tL.setupWithViewPager(vp);




    }
}