package com.example.messi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    TextView textView;
    int point1;
    int point2;
    int point3;
    int values;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent = getIntent();
        int value1 = intent.getIntExtra("key1", point1);
        int value2 = intent.getIntExtra("key2", point2);
        int value3 = intent.getIntExtra("key3", point3);

        values = value1 + value2 + value3;

        textView = findViewById(R.id.textView);
        textView.setText("Ukończyłeś/aś test, twoja liczba punktów to:  "+values);
    }
}