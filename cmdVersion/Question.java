package cmdVersion;
import connection.Anime;

public class Question {
    Anime leftAnime;
    Anime rightAnime;
    String difficulty = "Question object default difficulty";
    String prompt = "Question object default prompt";
    int answer = -1; // -1 is default, 0 is left, 1 is right

    // Constructors for making the question
    public Question(Anime leftAnime, Anime rightAnime, String difficulty, String prompt, int answer) {
        this.leftAnime = leftAnime;
        this.rightAnime = rightAnime;
        this.difficulty = difficulty;
        this.prompt = prompt;
        this.answer = answer;
    }


}
