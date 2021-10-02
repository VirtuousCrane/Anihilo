package cmdVersion.game.lifeControl;

import cmdVersion.game.stats.GameStats;

public class StageLifeControl extends LifeControl{

    Integer remainingLives = 3;
    final Integer baseGuessTillNextLife = 3;
    Integer lifeGivenOut = 0;
    Integer guessTillNextLife = 0;

    public StageLifeControl(){
        guessTillNextLife = lifeGivenOut + baseGuessTillNextLife;
    }

    @Override
    public boolean isAlive() {
        return remainingLives > 0;
    }

    @Override
    public void update(GameStats gameStats) {
        if(gameStats.isLatestQuestionAnsweredCorrect()){
            guessTillNextLife--;
            if(guessTillNextLife <= 0){
                remainingLives++;
                lifeGivenOut++;
                guessTillNextLife = baseGuessTillNextLife + lifeGivenOut;
            }
        } else {
            remainingLives--;
        }
    }
}
