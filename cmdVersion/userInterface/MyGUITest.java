package cmdVersion.userInterface;

import Frontend.GUI;
import cmdVersion.game.GameFactory;
import connection.ConnectionError;

import javax.swing.*;

public class MyGUITest {
    public static void main(String[] args){
        GUI gui = null;
        try{
            gui = GUI.getInstance();
        } catch (Exception e){
            System.out.println(e);
        }

        if(gui == null){
            return;
        }


        // Creating the game
        try{
            GameFactory.createGame(GameFactory.gameModes[0]);
        } catch (ConnectionError e){
            System.out.println(e.toString());
        }






    }
}
