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
        // Other setup code below...
        displayForTeamA(mViewModel.getScoreTeamA());
        displayForTeamB(mViewModel.getScoreTeamB());
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

    // Increase Team A score by 3
    public void addThreeForTeamA(View view) {
        mViewModel.setScoreTeamA(mViewModel.getScoreTeamA()+3);
        displayForTeamA(mViewModel.getScoreTeamA());
    }

    //Increase Team A score by 2
    public void addTwoForTeamA(View view) {
        mViewModel.setScoreTeamA(mViewModel.getScoreTeamA()+2);
        displayForTeamA(mViewModel.getScoreTeamA());
    }

    //Increase Team A score by 1
    public void addOneForTeamA(View v) {
        mViewModel.setScoreTeamA(mViewModel.getScoreTeamA()+1);
        displayForTeamA(mViewModel.getScoreTeamA());
    }



    //Increase Team B score by 3
    public void addThreeForTeamB(View view) {
        mViewModel.setScoreTeamB(mViewModel.getScoreTeamB()+3);
        displayForTeamB(mViewModel.getScoreTeamB());
    }

    // Increase Team B score by 2
    public void addTwoForTeamB(View view) {
        mViewModel.setScoreTeamB(mViewModel.getScoreTeamB()+2);
        displayForTeamB(mViewModel.getScoreTeamB());
    }

    //Increase Team B score by 1
    public void addOneForTeamB(View view) {
        mViewModel.setScoreTeamB(mViewModel.getScoreTeamB()+1);
        displayForTeamB(mViewModel.getScoreTeamB());
    }

    //Reset both Team score points
    public void resetScore(View v){
        mViewModel.setScoreTeamA(0);
        mViewModel.setScoreTeamB(0);
        displayForTeamA(mViewModel.getScoreTeamA());
        displayForTeamB(mViewModel.getScoreTeamB());
    }
}