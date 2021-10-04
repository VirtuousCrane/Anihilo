package main_menu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;

public class Main_Menu_Page {
    // public Main_Menu_Page() {
    // JFrame main_page = new JFrame();

    // // * Setting Frame Size and etc
    // main_page.setSize(750, 600);
    // main_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // main_page.setLayout(null);

    // // * set Title
    // main_page.setTitle("Higher or Lower");

    // // * Instruction

    // // * make JFrame visible (need to be put last)
    // main_page.setVisible(true);
    // }

    public static JPanel Main_Menu(JPanel main_page, CardLayout page) {

        JPanel menu = new JPanel();

        menu.setLayout(null);
        menu.setBounds(0, 0, 750, 600);

        // Create a Button
        JButton start_game = new JButton("Start");
        start_game.setBounds(20, 20, 200, 200);
        start_game.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                page.show(main_page, "page2");
            }
        });

        menu.add(start_game);

        main_page.add(menu);

        menu.setVisible(true);
        return menu;
    }
}
