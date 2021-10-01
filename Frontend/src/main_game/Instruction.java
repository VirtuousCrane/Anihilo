package main_game;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import utility.LineBreaker;

public class Instruction {
    public Instruction(JFrame main_page) {

        String prompt = "Which of the 2 anime is more popular?"; // ? get from Tae
        String word = LineBreaker.breaker(prompt);
        System.out.println(word);

        //// * (button for back)
        JButton back_button = new JButton("Main Menu");
        back_button.setBounds(10, 10, 100, 20);
        main_page.add(back_button);

        // * Create Text Area
        //// * Text for Instruction
        JPanel instruction_panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        instruction_panel.setBounds(125, 0, 500, 80);

        JLabel instruction_text = new JLabel(
                "<html><p{text-alignment: center;} style=\"font-size:18px\">" + word + "</p></html>");
        instruction_panel.add(instruction_text);

        main_page.add(instruction_panel);
    }
}
