package cmdVersion;
import cmdVersion.questionFactory.Question;
import cmdVersion.questionFactory.QuestionMaker;
import connection.Anime;

import java.util.ArrayList;
import java.util.Comparator;

public class cmdApp {
    public static void main(String[] args){

        QuestionMaker questionMaker = new QuestionMaker();
        Question q = questionMaker.makeQuestion("easy", "ratingRank");
        System.out.println(q.getLeftAnime().get_rating_rank());
        System.out.println(q.getRightAnime().get_rating_rank());
        System.out.println(q.getAnswer());


    }
}
