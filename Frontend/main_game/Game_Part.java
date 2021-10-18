package Frontend.main_game;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import Frontend.utility.LineBreaker;
import Frontend.utility.Image_Changer;
import Frontend.utility.Instruction_Changer;
import Frontend.utility.AnimeTitle_Changer;

public class Game_Part {
    public Game_Part(JPanel main_game_page, JPanel main_page, CardLayout page) {
        // * Create a button
        // ! Create a getPicture() here for left and right then change the ImageIcon or
        // ! just change the JButton

        //// * set panel (button for image)
        // large width*height (550x780)
        // medium (390x554)
        // small (110x156)

        // * Goto Utility Image_Changer for more info
        Image_Changer img = new Image_Changer();

        JButton button_L = new JButton(img.getImage_L());
        JButton button_R = new JButton(img.getImage_R());

        button_L.setBounds(120, 80, 195, 277);
        button_R.setBounds(435, 80, 195, 277);

        button_L.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button_L.setIcon(img.getImage_L());
                // Testing for change
                System.out.println("Left Button was clicked.");
                Instruction_Changer.set_instruction("a new world");
                // end
                Instruction_Changer.change_instruction();
                AnimeTitle_Changer.changeAnimeTitle();
            }
        });
        button_R.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button_R.setIcon(img.getImage_R());
                // Testing for change
                System.out.println("Right Button was clicked.");
                Instruction_Changer.set_instruction("and a new experience");
                // end
                Instruction_Changer.change_instruction();
                AnimeTitle_Changer.changeAnimeTitle();
            }
        });

        main_game_page.add(button_L);
        main_game_page.add(button_R);

        //// * Anime title
        String anime_L = "Naruto: Shippuden"; // ? get from Tae
        String anime_R = "wrapping check 12345 67890a sdfa df d s ad fwe asdf asd"; // ? get from Tae

        anime_L = LineBreaker.breaker(anime_L, 25);
        anime_R = LineBreaker.breaker(anime_R, 25);

        JPanel aniPanel_L = new JPanel();
        aniPanel_L.setBounds(100, 350, 235, 100);
        JPanel aniPanel_R = new JPanel();
        aniPanel_R.setBounds(415, 350, 235, 100);

        JLabel aniL_text = new JLabel(
                "<html><p{text-alignment: center;} style=\"font-size:12px\">" + anime_L + "</p></html>");
        aniPanel_L.add(aniL_text);
        JLabel aniR_text = new JLabel(
                "<html><p{text-alignment: center;} style=\"font-size:12px\">" + anime_R + "</p></html>");
        aniPanel_R.add(aniR_text);

        main_game_page.add(aniPanel_L);
        main_game_page.add(aniPanel_R);
        new AnimeTitle_Changer(aniL_text, aniR_text);
    }
}