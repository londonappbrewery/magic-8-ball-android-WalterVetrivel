package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = (Button) findViewById(R.id.askButton);
        final ImageView answerImage = (ImageView) findViewById(R.id.answerImage);
        final TextView questionText = (TextView) findViewById(R.id.question);
        final int[] answerArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        final int[] questionArray = {
                R.string.question1,
                R.string.question2,
                R.string.question3,
                R.string.question4,
                R.string.question5
        };
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);
                questionText.setText(questionArray[number]);
                number = randomNumberGenerator.nextInt(5);
                answerImage.setImageResource(answerArray[number]);
            }
        });
    }
}
