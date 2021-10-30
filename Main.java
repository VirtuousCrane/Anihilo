import cmdVersion.game.Game;
import cmdVersion.game.GameFactory;
import connection.*;
import Frontend.GUI;

import java.util.HashMap;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        try {
            GUI gui = GUI.getInstance();
            gui.useDefaultStartButton();

            Game game = null;
            game = GameFactory.createGame(GameFactory.gameModes[0]);
            game.initializeGame();

            // ONLY USE useDefaultButtonBehavior IN TEST
            // ENVIRONMENT
            // gui.useDefaultButtonBehavior();

            Game finalGame = game;
            gui.setLeftAnimeButtonCallback(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                }
            });

            gui.setRightAnimeButtonCallback(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                }
            });

            gui.start();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
