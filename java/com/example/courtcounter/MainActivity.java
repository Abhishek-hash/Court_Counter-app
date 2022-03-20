package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    // -------------Team A code------------------//
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 3 points to the team A score
     *
     * @param v
     */
    public void addThreePointsA(View v) {
        displayForTeamA(scoreTeamA += 3);
    }

    /**
     * Add 2 points to the team A score
     *
     * @param v
     */
    public void addTwoPointsA(View v) {
        displayForTeamA(scoreTeamA += 2);
    }


    // -------------Team B code------------------//

    /**
     * Add 1 points to the team A score
     *
     * @param v
     */
    public void addFreePointsA(View v) {
        displayForTeamA(scoreTeamA += 1);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 3 points to the team B score
     *
     * @param v
     */
    public void addThreePointsB(View v) {
        displayForTeamB(scoreTeamB += 3);
    }

    /**
     * Add 2 points to the team B score
     *
     * @param v
     */
    public void addTwoPointsB(View v) {
        displayForTeamB(scoreTeamB += 2);
    }

    /**
     * Add 1 points to the team B score
     *
     * @param v
     */
    public void addFreePointsB(View v) {
        displayForTeamB(scoreTeamB += 1);
    }

    //----------------- RESET button-------------------//

    /**
     * Resets the score for both the teams to 0.
     *
     * @param v
     */
    public void resetScoreForBothTeams(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}