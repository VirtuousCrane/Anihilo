package cmdVersion.game.questionControl;

import cmdVersion.game.stats.GameStats;
import cmdVersion.questionFactory.QuestionMaker;

public class StageQuestionControl extends QuestionControl {

    Integer correctGuess = 0;

    @Override
    public String getQuestionDifficulty() {
        return "";
    }

    @Override
    public String getQuestionType() {
        return null;
    }

    @Override
    public void update(GameStats gameStats) {

    }
}
