package android.example.courtcounter;


import androidx.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {

    // Tracks the score for Team A
    private int scoreTeamA = 0;
    // Tracks the score for Team B
    private int scoreTeamB = 0;

    public int getScoreTeamA() {
        return scoreTeamA;
    }

    public void setScoreTeamA(int scoreTeamA) {
        this.scoreTeamA = scoreTeamA;
    }

    public int getScoreTeamB() {
        return scoreTeamB;
    }

    public void setScoreTeamB(int scoreTeamB) {
        this.scoreTeamB = scoreTeamB;
    }

}