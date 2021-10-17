package Frontend.utility;

import javax.swing.JLabel;
import Frontend.main_game.Instruction;

public class Text_Changer {
    String instruction = "";
    String animeTitle_L = "";
    String animeTitle_R = "";
    JLabel instruction_text = Instruction.get_instruction();

    public void change_instruction() {
        instruction = LineBreaker.breaker(instruction, 30);
        instruction_text
                .setText("<html><p{text-alignment: center;} style=\"font-size:18px\">" + instruction + "</p></html>");
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