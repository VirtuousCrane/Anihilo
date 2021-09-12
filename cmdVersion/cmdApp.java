package cmdVersion;
import connection.Anime;

import java.util.ArrayList;
import java.util.Comparator;

public class cmdApp {
    public static void main(String[] args){

        QuestionMaker questionMaker = new QuestionMaker();
        questionMaker.generateRandomNumberList();
        questionMaker.fillAnimeList();
//        questionMaker.sortBy("ratingRank");
//        for(int i = 0; i < 10; i++){
//            System.out.println(questionMaker.animeList.get(i).get_name());
//            System.out.println(questionMaker.animeList.get(i).get_rating_rank());
//        }
        Question q = questionMaker.internalMakeQuestion(0.4,"Easy", "ratingRank", "Pick better rank");
        System.out.println(q.leftAnime.get_rating_rank());
        System.out.println(q.rightAnime.get_rating_rank());
        System.out.println(q.answer);

        for(Anime a: questionMaker.animeList){
            System.out.println(a.get_rating_rank());
        }


    }
}
