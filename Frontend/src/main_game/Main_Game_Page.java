package main_game;

import javax.swing.JPanel;
import java.awt.CardLayout;

public class Main_Game_Page {

        // public Main_Game_Page() {
        // JFrame main_page = new JFrame();

        // // * Setting Frame Size and etc
        // main_page.setSize(750, 600);
        // main_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // main_page.setLayout(null);

        // // * set Title
        // main_page.setTitle("Higher or Lower");

        // // * Instruction
        // new Instruction(main_page);
        // new Game_Part(main_page);
        // new Score_Part(main_page);

        // // * make JFrame visible (need to be put last)
        // main_page.setVisible(true);
        // }
        public static JPanel Main_Game(JPanel main_page, CardLayout page) {
                JPanel menu = new JPanel();
                menu.setBounds(0, 0, 750, 600);
                menu.setLayout(null);

                new Instruction(menu, main_page, page);
                new Game_Part(menu, main_page, page);
                new Score_Part(menu, main_page, page);

                main_page.add(menu);

                menu.setVisible(true);
                return menu;
        }
}