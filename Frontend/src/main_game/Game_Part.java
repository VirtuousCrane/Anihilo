package main_game;

import java.awt.Image;
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

        Image get_left_pic = new ImageIcon("Frontend/src/Main_Game/Example_photo.jpg").getImage();
        Image get_right_pic = new ImageIcon("Frontend/src/Main_Game/Example_photo.jpg").getImage();

        Image left_resize = get_left_pic.getScaledInstance(195, 277, Image.SCALE_DEFAULT);
        Image right_resize = get_right_pic.getScaledInstance(195, 277, Image.SCALE_DEFAULT);

        ImageIcon left_pic_resize = new ImageIcon(left_resize);
        ImageIcon right_pic_resize = new ImageIcon(right_resize);

        JButton left_button = new JButton(left_pic_resize);
        JButton right_button = new JButton(right_pic_resize);

        left_button.setBounds(120, 80, 195, 277);
        right_button.setBounds(435, 80, 195, 277);

        main_page.add(left_button);
        main_page.add(right_button);

        //// * Anime title
    }
}
