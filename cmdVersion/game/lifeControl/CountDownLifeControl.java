package cmdVersion.game.lifeControl;

import cmdVersion.game.stats.GameStats;

public class CountDownLifeControl extends LifeControl {
    static final Integer DEFAULT_AMOUNT_OF_LIVES = 3;
    int remainingLives = DEFAULT_AMOUNT_OF_LIVES;

    /**
     * Checks whether the player is still alive
     *
     * @return boolean Whether the player is alive
     */
    @Override
    public boolean isAlive() {
        return remainingLives > 0;
    }

    /**
     * Updates the life of the player
     */
    @Override
    public void update(GameStats gameStats) {
        if(gameStats.isLatestQuestionAnsweredCorrect()){
            remainingLives--;
        }
    }

    @Override
    public String toString() {
        return "Remaining lives: " + remainingLives;
    }

    /**
     * Resets the life stat of the player
     */
    @Override
    public void reset() {
        remainingLives = DEFAULT_AMOUNT_OF_LIVES;
    }
}
