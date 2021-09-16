package Main_Game;

import javax.swing.JFrame;
// import java.awt.Color;
// import java.awt.FlowLayout;
// import javax.swing.border.MatteBorder; // extra modify for border
// import javax.swing.ImageIcon;
// import javax.swing.JButton;
// import javax.swing.JLabel;
// import javax.swing.JPanel;

public class Main_Game_Page {

        public Main_Game_Page() {
                JFrame main_page = new JFrame();

                // * Setting Frame Size and etc
                main_page.setSize(600, 500);
                main_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                main_page.setLayout(null);

                // * set Title
                main_page.setTitle("Higher or Lower");

                // * Instruction
                new Instruction(main_page);
                new Game_Part(main_page);
                new Score_Part(main_page);

                // * make JFrame visible (need to be put last)
                main_page.setVisible(true);
        }
}