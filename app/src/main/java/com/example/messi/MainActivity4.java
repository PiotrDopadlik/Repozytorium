package com.example.messi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    TextView textView;
    int points;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent = getIntent();
        int value = intent.getIntExtra("key3", points);

        textView = findViewById(R.id.textView);
        textView.setText("Wartość "+value);
    }
}