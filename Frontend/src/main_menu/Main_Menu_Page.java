package main_menu;

import javax.swing.JFrame;

public class Main_Menu_Page {
    public Main_Menu_Page() {
        JFrame main_page = new JFrame();

        // * Setting Frame Size and etc
        main_page.setSize(750, 600);
        main_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_page.setLayout(null);

        // * set Title
        main_page.setTitle("Higher or Lower");

        // * Instruction

        // * make JFrame visible (need to be put last)
        main_page.setVisible(true);
    }
}
