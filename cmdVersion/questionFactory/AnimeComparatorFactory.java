package cmdVersion.questionFactory;
import connection.Anime;
import java.util.Comparator;



public class AnimeComparatorFactory {
    final public String[] comparatorType = {"ratingRank"};

    public static Comparator<Anime> getComparator(String type){
        Comparator<Anime> ratingRankComp = (a1,a2) -> a2.get_rating_rank()-a1.get_rating_rank(); // Positive when a1 has better rank than a2

        if(type.equalsIgnoreCase("ratingRank")){
            return ratingRankComp;
        } else {
            System.out.println("Error: QuestionMaker getComparator()");
            System.out.println("Returning ratingRankComp comparator as default");
            return ratingRankComp;
        }


    }
}
