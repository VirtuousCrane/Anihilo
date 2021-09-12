package cmdVersion;
import connection.Anime;
import connection.JSON;
import connection.Kitsu;

                                       

public class cmdApp {
    public static void main(String[] args){
        Anime anime1 =  new Anime();
        Anime anime2 = new Anime();
        Question q1 = new Question(anime1,anime2,"Easy","Select more popular",1);
        System.out.println(q1.toString());


    }
}
