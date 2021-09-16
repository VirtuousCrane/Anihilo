package main_game;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game_Part {
    public Game_Part(JFrame main_page) {
        // * Create a button
        // ! Create a getPicture() here for left and right then change the ImageIcon or
        // ! just change the JButton

        //// * set panel (button for image)
        // large width*height (550x780)
        // medium (390x554)
        // small (110x156)

        ImageIcon left_pic = new ImageIcon("Frontend/src/Main_Game/Unknown.jpg");
        ImageIcon right_pic = new ImageIcon("Frontend/src/Main_Game/Unknown.jpg");
        JButton left_button = new JButton(left_pic);
        JButton right_button = new JButton(right_pic);
        left_button.setBounds(116, 80, 130, 180);
        right_button.setBounds(376, 80, 130, 180);

        main_page.add(left_button);
        main_page.add(right_button);

        //// * Anime title
    }
}
