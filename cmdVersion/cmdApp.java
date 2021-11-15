package cmdVersion;

import Frontend.GUI;
import Frontend.Main_GUI;
import cmdVersion.game.Game;
import cmdVersion.game.GameFactory;
import connection.ConnectionError;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class cmdApp {
    public static void main(String[] args){
        cmdApp.cmdAttempt();
    }

    /**
     * Starts the cmd version of the game
     */
    public static void cmdAttempt(){
        GUI gui = null;
        Game game = null;
        try {
            gui = GUI.getInstance();
            game = GameFactory.createGame(GameFactory.gameModes[0]);
            game.initializeGame();
        } catch (Exception e){
            System.out.println(e);
        }

        Scanner input = new Scanner(System.in);
        int userInput = -1;
        while(userInput != 0){
            System.out.println("Enter your options: ");
            System.out.println("1. Click leftAnimeButton");
            System.out.println("2. Click rightAnimeButton");
            System.out.println("3. Click nextQuestionButton");
            System.out.println("4. Click resetGameButton");
            System.out.println("5. Click previousPageButton");
            System.out.println("0. Exit");
            System.out.print("Select your option: ");

            try{
                userInput = Integer.parseInt(input.nextLine());
            } catch (Exception e){
                System.out.println("Error input please try again");
            }



            switch(userInput){
                case 1 -> game.clickButtonLeftAnimeImg();
                case 2 -> game.clickButtonRightAnimeImg();
                case 3 -> game.clickButtonNextQuestion();
                case 4 -> game.clickButtonResetGame();
                case 5 -> game.clickButtonBackToPreviousPage();
                case 0 -> System.out.println("About to exit experiment");
            }
        }
    }

}
