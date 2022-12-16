package com.example.messi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Question question = new Question("Ile palców ma człowiek", new String[]{"5", "10", "20"},2,-1);
    Button button;
    TextView textView;
    TextView text;
    String[] answers;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    int points;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.text);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        answers = question.getAnswers();

        textView.setText(question.getContent());
        text = findViewById(R.id.textView);
        radioButton1.setText(answers[0]);
        radioButton2.setText(answers[1]);
        radioButton3.setText(answers[2]);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioButton1.isChecked())
                {
                    question.setAnswer(0);
                    question.getSelectedAnswer();
                    question.checkAnswer();
                    points = question.getPoints();
                }
                else
                if(radioButton2.isChecked())
                {
                    question.setAnswer(1);
                    question.getSelectedAnswer();
                    question.checkAnswer();
                    points = question.getPoints();
                }
                else
                if(radioButton3.isChecked())
                {
                    question.setAnswer(2);
                    question.getSelectedAnswer();
                    question.checkAnswer();
                    points = question.getPoints();
                }

                if(!radioButton1.isChecked() && !radioButton2.isChecked() && !radioButton3.isChecked())
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Zaznacz odpowiedź");
                    builder.setPositiveButton("Ok", (DialogInterface.OnClickListener) (dialog, which) -> {

                    });

                    // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                    builder.setNegativeButton("Nie, to niemożliwe", (DialogInterface.OnClickListener) (dialog, which) -> {
                        finish();
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }else
                if(radioButton1.isChecked() || radioButton2.isChecked() || radioButton3.isChecked()){
                    text.setText("Suma "+points);
                    Intent myIntent = new Intent(MainActivity.this, MainActivity2.class);
                    myIntent.putExtra("key1", points);
                    MainActivity.this.startActivity(myIntent);
                }
            }
        });
    }
}