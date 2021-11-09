package cmdVersion.game.questionFactory;
import connection.Anime;

public class Question {
    Anime leftAnime;
    Anime rightAnime;

    String leftAnimeImgPath;
    String rightAnimeImgPath;

    String difficulty = "Question object default difficulty";
    String prompt = "Question object default prompt";
    String type = "Question object default type";
    int answer = 0; // -1 is left, 0 is both correct, 1 is right

    public static final Integer ANSWER_LEFT = -1;
    public static final Integer ANSWER_RIGHT = 1;
    public static final Integer ANSWER_BOTH_CORRECT = 0;

    /**
     * The Class Constructor
     *
     * @param leftAnime          One of the anime to be compared
     * @param rightAnime         Another anime to be compared
     * @param difficulty         The difficulty of the question
     * @param prompt             The prompt
     * @param answer             The answer to the question
     * @param leftAnimeImgPath   The Image path of the first anime
     * @param rightAnimeImgPath  The Image path of the second anime
     * @param type               The type of the question
     */
    public Question(Anime leftAnime, Anime rightAnime, String difficulty, String prompt, int answer, String leftAnimeImgPath, String rightAnimeImgPath, String type) {
        this.leftAnime = leftAnime;
        this.rightAnime = rightAnime;
        this.difficulty = difficulty;
        this.prompt = prompt;
        this.answer = answer; // -1 means left, 0 means both answer are correct, 1 means right
        this.leftAnimeImgPath = leftAnimeImgPath;
        this.rightAnimeImgPath = rightAnimeImgPath;
        this.type = type;
    }

    /**
     * Returns the left Anime object
     *
     * @return Anime The left Anime object
     */
    public Anime getLeftAnime() {
        return leftAnime;
    }

    /**
     * Sets the left Anime
     */
    public void setLeftAnime(Anime leftAnime) {
        this.leftAnime = leftAnime;
    }

    /**
     * Returns the right Anime object
     *
     * @return Anime The right Anime object
     */
    public Anime getRightAnime() {
        return rightAnime;
    }

    /**
     * Sets the right Anime
     */
    public void setRightAnime(Anime rightAnime) {
        this.rightAnime = rightAnime;
    }

    /**
     * Gets the game's difficulty
     *
     * @return String The difficulty of the game
     */
    public String getDifficulty() {
        return difficulty;
    }

    /**
     * Sets the difficulty level of the game
     */
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * Gets the game's prompt
     *
     * @return String The game's prompt
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * Sets the game's prompt
     */
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    /**
     * Gets the correct answer
     */
    public int getAnswer() {
        return answer;
    }

    /**
     * Sets the answer to the question
     */
    public void setAnswer(int answer) {
        this.answer = answer;
    }

    /**
     * Gets the path to the left Anime's image
     *
     * @return String The left anime's path
     */
    public String getLeftAnimeImgPath() {
        return leftAnimeImgPath;
    }

    /**
     * Sets the path of the left Anime's image
     */
    public void setLeftAnimeImgPath(String leftAnimeImgPath) {
        this.leftAnimeImgPath = leftAnimeImgPath;
    }

    /**
     * Gets the path of the right Anime's image
     *
     * @return String The right Anime's image path
     */
    public String getRightAnimeImgPath() {
        return rightAnimeImgPath;
    }

    /**
     * Sets the path of the right Anime's image
     */
    public void setRightAnimeImgPath(String rightAnimeImgPath) {
        this.rightAnimeImgPath = rightAnimeImgPath;
    }

    /**
     * Gets the data of the left Anime
     */
    public String getLeftAnimeQuestionRelevantData(){
        return getAnimeQuestionRelevantData(leftAnime);
    }

    /**
     * Gets the data of the right Anime
     */
    public String getRightAnimeQuestionRelevantData(){
        return getAnimeQuestionRelevantData(rightAnime);
    }

    /**
     * Gets the type of the Question
     */
    public String getType() {
        return type;
    }

    /**
     * Gets the relevant data of the Anime
     *
     * @param anime The Anime object to get the data from
     * @return String The output string
     */
    public String getAnimeQuestionRelevantData(Anime anime){
        String output;

        if(type.equalsIgnoreCase(QuestionMaker.questionTypes[0])){
            output = String.valueOf(anime.get_rating_rank());
        } else if (type.equalsIgnoreCase(QuestionMaker.questionTypes[1])) {
            output = String.valueOf(anime.get_popularity_rank());
        } else if (type.equalsIgnoreCase(QuestionMaker.questionTypes[2])){
            output = String.valueOf(anime.get_start_date());
        } else {
            System.out.println("Error: At method getLeftAnimeQuestionReleventData() in Question()");
            System.out.println("Returning: The name of anime");
            output = String.valueOf(anime.get_name());
        }
        output = type + " is " + output;
        return output;
    }

    /**
     * Checks the answer of the user
     *
     * @param userAnswer The answer of the user (-1 left, 1 right)
     * @return boolean Whether the user answered correctly
     */
    public boolean checkAnswer(int userAnswer){
        // this.answer == 0 means both side are correct "a freebie"
        return (userAnswer == this.answer) || (this.answer == Question.ANSWER_BOTH_CORRECT);
    }

    /**
     * Returns the information string
     *
     * @return String The information string
     */
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
