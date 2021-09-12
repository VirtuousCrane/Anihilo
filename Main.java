import connection.Anime;
import connection.Kitsu;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Anime a = new Anime();
        System.out.println (a.toString());
        a.download_medium_img("./");

    }
}
