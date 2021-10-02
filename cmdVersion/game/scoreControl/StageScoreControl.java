package cmdVersion.game.scoreControl;

import cmdVersion.game.stats.GameStats;

public class StageScoreControl extends ScoreControl{

    Integer totalScore = 0;
    Integer baseScorePerQuestion = 100;
    Integer streakBonus = 10;

    @Override
    public void update(GameStats gameStats) {
        if(gameStats.isLatestQuestionAnsweredCorrect()){
            totalScore += baseScorePerQuestion;
            totalScore += gameStats.getGuessCorrectStreak() * streakBonus;
        }
    }

    @Override
    public Integer calculateScore() {
        return totalScore;
    }
}
