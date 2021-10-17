package Frontend.utility;

public class Text_Changer {
    String instruction = "";
    String animeTitle_L = "";
    String animeTitle_R = "";

    public String get_instruction() {
        return instruction;
    }

    public String get_animeTitle_L() {
        return animeTitle_L;
    }

    public String get_animeTitle_R() {
        return animeTitle_R;
    }

    public void set_instruction(String instruction_text) {
        instruction = instruction_text;
    }

    public void set_animeTitle_L(String animeTitle) {
        animeTitle_L = animeTitle;
    }

    public void set_animeTitle_R(String animeTitle) {
        animeTitle_R = animeTitle;
    }
}