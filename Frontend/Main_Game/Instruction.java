package Main_Game;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Instruction {
    public Instruction(JFrame main_page) {
        //// * (button for back)
        JButton back_button = new JButton("Main Menu");
        back_button.setBounds(10, 10, 100, 20);
        main_page.add(back_button);

        // * Create Text Area
        //// * Text for Instruction
        JPanel instruction_panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        instruction_panel.setBounds(150, 0, 300, 80);

        JLabel instruction_text = new JLabel(
                "<html><p{text-alignment: center;} style=\"font-size:18px\"> Which of the 2 <BR> anime is more popular?</p></html>");
        instruction_panel.add(instruction_text);

        main_page.add(instruction_panel);
    }
}
