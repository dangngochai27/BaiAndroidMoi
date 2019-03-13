package com.example.student.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainFragmentBActivity extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment_b);
        tv1 = findViewById(R.id.tv_fragB);
        Intent intent = getIntent();
        String s = intent.getStringExtra("goidulieu");
        tv1.setText(s);
    }
}
