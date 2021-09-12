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
        this.answer = answer; // -1 means left, 0 means both answer are correct, 1 means right
    }

    public Anime getLeftAnime() {
        return leftAnime;
    }

    public void setLeftAnime(Anime leftAnime) {
        this.leftAnime = leftAnime;
    }

    public Anime getRightAnime() {
        return rightAnime;
    }

    public void setRightAnime(Anime rightAnime) {
        this.rightAnime = rightAnime;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "leftAnime=" + leftAnime.toString() +
                ", rightAnime=" + rightAnime.toString() +
                ", difficulty='" + difficulty + '\'' +
                ", prompt='" + prompt + '\'' +
                ", answer=" + answer +
                '}';
    }


}
