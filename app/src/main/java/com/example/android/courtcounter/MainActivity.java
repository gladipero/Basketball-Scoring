package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
 int scoreA,scoreB,zero='0';

    public void threePointer(View view)
    {
        scoreA=scoreA + 3;
        display(scoreA);
    }
    public void twoPointer(View view)
    {
        scoreA= scoreA + 2;
        display(scoreA);
    }
    public void freeThrow(View view)
    {
        scoreA++;
        display(scoreA);

    }
    public void display(int number)
    {
        TextView scoreTextview =(TextView) findViewById(R.id.score_team_A);
        scoreTextview.setText("" + number);
    }
    public void threePointerB(View view)
    {
        scoreB=scoreB + 3;
        displayB(scoreB);
    }
    public void twoPointerB(View view)
    {
        scoreB= scoreB + 2;
        displayB(scoreB);
    }
    public void freeThrowB(View view)
    {
        scoreB++;
        displayB(scoreB);

    }
    public void displayB(int number)
    {
        TextView scoreTextview =(TextView) findViewById(R.id.score_team_B);
        scoreTextview.setText("" + number);
    }
    public void Reset(View view)
    {
        display(0);
        displayB(0);
    }



}
