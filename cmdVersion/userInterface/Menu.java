package cmdVersion.userInterface;

import cmdVersion.game.Game;

import java.util.Scanner;


public class Menu {
    public static final Integer EXIT = 0;



    public void showMainMenu() {
        Scanner input = new Scanner(System.in);
        Integer userInput = -1;

        while(userInput != 2) {
            System.out.println("Main menu page");
            System.out.println("0. Exit");
            System.out.println("1. Play");
            System.out.println("Select your option: ");
            userInput = Integer.parseInt(input.nextLine());


            switch (userInput) {
                case 0 -> {
                    System.out.println("User have selected option 0: Exit");
                    System.out.println("Prepare to move the exit page");
                }
                case 1 -> {
                    System.out.println("User have selected option 1: Play");
                    System.out.println("Prepare to move to play page");
                    showSelectGameMode();
                }
            }
        }
        System.out.println("Exit the program by clicking exit button");

    } // END OF showMainMenu()

    public void showSelectGameMode(){
        Scanner input = new Scanner(System.in);
        Integer userInput = -1;

        while(userInput != 0) {
            System.out.println("Main menu page");
            System.out.println("0. Exit");
            System.out.println("1. Classic");
            System.out.println("2. Suddent Death");
            System.out.println("3. RNG");
            System.out.println("4. Practice");
            System.out.println("Select your option: ");
            userInput = Integer.parseInt(input.nextLine());


            switch (userInput) {
                case 0 -> {
                    System.out.println("User has selected option 0: Exit");
                    System.out.println("Prepare to move back a page/exit program");
                }
                case 1 -> {
                    System.out.println("User have selected option 1: Classic");
                    System.out.println("Prepare to move to game age with classic game");
                }
                case 2 -> {
                    System.out.println("User have selected option 2: Sudden death");
                    System.out.println("Prepare to move the game page with sudden death game");
                }
                case 3 -> {
                    System.out.println("User have selection option 3: RNG");
                    System.out.println("Prepare to move to game page with RNG game");
                }
                case 4 -> {
                    System.out.println("User have selected option 4: Practice");
                    System.out.println("Prepare to move to game page with practice game");
                }
            }


        }
    } // END OF selectionGameMode()

    public void showGamePage(Game inGame){
        Scanner input = new Scanner(System.in);

//        System.out.println("Game is about to begin");
//        String userInput = "Y";
//        while(userInput.contentEquals("Y")){
//            Game currentGame =
//            currentGame.run();
//            System.out.println("Would you like to continue? Y/N");
//            userInput = input.nextLine();
//        }


    }


}
