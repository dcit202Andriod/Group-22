package com.example.recipe_guide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ViewPager  mSlideViewPager;
    LinearLayout mDotLayout;
    Button backbtn, nextbtn, skipbtn;

    TextView[] dots;
    ViewPagerAdapter viewPagerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        backbtn = findViewById(R.id.backbtn);
        nextbtn = findViewById(R.id.nextbtn);
        skipbtn = findViewById(R.id.skipbtn);

        backbtn.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){}
        });

        nextbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){}
        });

        skipbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){}
        });

        mSlideViewPager = (ViewPager) findViewById(R.id.slide);
        mDotLayout = (LinearLayout) findViewById(R.id.indicator_La)




    }
}