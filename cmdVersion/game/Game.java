package cmdVersion.game;

import cmdVersion.game.lifeControl.LifeControl;
import cmdVersion.game.questionControl.QuestionControl;
import cmdVersion.game.scoreControl.ScoreControl;
import cmdVersion.game.stats.GameStats;
import cmdVersion.questionFactory.QuestionMaker;

public class Game {

    QuestionMaker questionMaker = new QuestionMaker();
    GameStats gameStats = new GameStats();
    QuestionControl questionControl;
    LifeControl lifeControl;
    ScoreControl scoreControl;


}
