import java.awt.Color;
import javax.swing.border.MatteBorder; // extra modify for border
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Box.Filler;

public class Front_End_Main {

    Front_End_Main() {
        JFrame main_page = new JFrame();

        // * Setting Frame Size and etc
        main_page.setSize(600, 500); // size (length, height)
        main_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Program Terminate Upon close
        main_page.setLayout(null);

        // * set Title
        main_page.setTitle("Higher or Lower");

        // * Create Border
        JPanel score_border = new JPanel();
        score_border.setBounds(0, 350, 200, 150); // (Coordinate(x-axis, y-axis, length, height))
        score_border.setBorder(new MatteBorder(1, 1, 1, 1, Color.black)); // MatteBorder(top, left, down, right, Color)
        JTextArea score = new JTextArea();
        JPanel guess_border = new JPanel();
        guess_border.setBounds(200, 350, 200, 150);
        guess_border.setBorder(new MatteBorder(1, 0, 1, 0, Color.black));
        JPanel accuracy_border = new JPanel();
        accuracy_border.setBounds(400, 350, 200, 150);
        accuracy_border.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));

        main_page.add(score_border);
        main_page.add(guess_border);
        main_page.add(accuracy_border);

        // * Create a button
        // ! Create a getPicture() here for left and right then change the ImageIcon or
        // ! just change the JButton

        // * set panel
        JPanel border = new JPanel();
        border.setBounds(0, 350, 600, 150);
        border.setBackground(Color.gray);

        ImageIcon left_pic = new ImageIcon("Unknown.jpg"); // setImage
        ImageIcon right_pic = new ImageIcon("Unknown.jpg");
        JButton left_button = new JButton(left_pic);
        JButton right_button = new JButton(right_pic);
        left_button.setBounds(116, 80, 130, 180); // x-axis, y-axis, width, height
        right_button.setBounds(376, 80, 130, 180);

        main_page.add(left_button);
        main_page.add(right_button);

        // * Create Text Area

        // * Create a Message Using JTextPane

        main_page.setVisible(true); // make frame visible

    }
}