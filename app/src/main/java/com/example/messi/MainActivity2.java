package com.example.messi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Question question = new Question("Ile mamy dni tygodnia", new String[]{"7", "6", "5"},0,-1);
    Button button;
    TextView textView;
    String[] answers;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    int points;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        int value = intent.getIntExtra("key1", points);
        points += value;

        button = findViewById(R.id.button);
        textView = findViewById(R.id.text);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        answers = question.getAnswers();

        textView.setText(question.getContent());
        radioButton1.setText(answers[0]);
        radioButton2.setText(answers[1]);
        radioButton3.setText(answers[2]);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioButton1.isChecked())
                {
                    question.setSelectedAnswer(0);
                    question.getSelectedAnswer();
                    question.checkAnswer();
                    points = question.getPoints();
                }
                else
                if(radioButton2.isChecked())
                {
                    question.setSelectedAnswer(1);
                    question.getSelectedAnswer();
                    question.checkAnswer();
                    points = question.getPoints();
                }
                else
                if(radioButton3.isChecked())
                {
                    question.setSelectedAnswer(2);
                    question.getSelectedAnswer();
                    question.checkAnswer();
                    points = question.getPoints();
                }
                Intent myIntent = new Intent(MainActivity2.this, MainActivity3.class);
                myIntent.putExtra("key2", points);
                MainActivity2.this.startActivity(myIntent);
            }
        });
    }
}