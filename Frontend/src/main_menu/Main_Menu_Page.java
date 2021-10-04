package main_menu;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Main_Menu_Page {
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
