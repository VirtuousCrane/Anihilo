package cmdVersion;
import cmdVersion.questionFactory.Question;
import cmdVersion.questionFactory.QuestionMaker;
import connection.Anime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class cmdApp {
    public static void main(String[] args){

        // Simple demo
        QuestionMaker questionMaker = new QuestionMaker();
        Question q;
        Scanner input = new Scanner(System.in);

        int userAnswer;

        for(int i = 0; i < 5; i++){
            q = questionMaker.makeQuestion("easy", "ratingRank");
            System.out.println(q.getPrompt() + "\n");
            System.out.println("Anime 1: " + q.getLeftAnime().get_name());
            System.out.println("Anime 2: " + q.getRightAnime().get_name());

            System.out.print("\n Type -1 for Anime 1, and 1 for Anime 2: ");
            userAnswer = input.nextInt();

            if(q.checkAnswer(userAnswer)){
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong");
            }

            System.out.println("Anime 1 has rating rank of " + q.getLeftAnime().get_rating_rank());
            System.out.println("Anime 2 has rating rank of " + q.getRightAnime().get_rating_rank());

        }

    }
}
