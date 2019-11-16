package android.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity {
    ScoreViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         mViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);
        displayForTeamA(mViewModel.scoreTeamA);
        displayForTeamB(mViewModel.scoreTeamB);
    }

    //Displays the given score for Team A.
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given score for Team B.
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //Increase the score for Team A by 3
    public void addThreeForTeamA(View view) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 3;
        displayForTeamA(mViewModel.scoreTeamA);
    }

    //Increase the score for Team A by 2
    public void addTwoForTeamA(View view) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 2;
        displayForTeamA(mViewModel.scoreTeamA);
    }

    //Increase the score for Team A by 1
    public void addOneForTeamA(View v) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 1;
        displayForTeamA(mViewModel.scoreTeamA);
    }

    //Increase the score for Team B by 3
    public void addThreeForTeamB(View view) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 3;
        displayForTeamB(mViewModel.scoreTeamB);
    }

    //Increase the score for Team B by 2
    public void addTwoForTeamB(View view) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 2;
        displayForTeamB(mViewModel.scoreTeamB);
    }
    //Increase the score for Team B by 1
    public void addOneForTeamB(View v) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 1;
        displayForTeamB(mViewModel.scoreTeamB);
    }

    //Reset both Team score points
    public void resetScore(View v){
        mViewModel.scoreTeamA =0;
        mViewModel.scoreTeamB = 0;

        displayForTeamA(mViewModel.scoreTeamA);
        displayForTeamB(mViewModel.scoreTeamB);
    }

}
