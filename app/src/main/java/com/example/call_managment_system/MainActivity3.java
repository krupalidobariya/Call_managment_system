package com.example.call_managment_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView = findViewById(R.id.text_view);

        Intent intent  = getIntent();
        String numberword=intent.getStringExtra("Word");
        int number = intent.getIntExtra("value",0);
        textView.setText(numberword);
        textView.setText(number);
    }
}