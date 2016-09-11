package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static int scoreA = 0;
    public static int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThree(View view){
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }


    public void addTwo(View view){
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }


    public void addOne(View view){
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

// Second part..
    public void addThreeB(View view){
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
        System.out.println("Test");
    }


    public void addTwoB(View view){
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }


    public void addOneB(View view){
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
        System.out.println("Test2");

    }

    public void reset(View view){
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(0));
        scoreA = 0;

        System.out.println("test does this even run?");

        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(0));
        scoreB = 0;

    }
}
