import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.border.MatteBorder; // extra modify for border
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Front_End_Main {

    Front_End_Main() {
        JFrame main_page = new JFrame();

        // * Setting Frame Size and etc
        main_page.setSize(600, 500); // size (length, height)
        main_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Program Terminate Upon close
        main_page.setLayout(null);
        main_page.setVisible(true);

        // * set Title
        main_page.setTitle("Higher or Lower");

        // * Create Border
        // * Panel for score
        JPanel score_border = new JPanel(new FlowLayout(FlowLayout.CENTER, 70, 10)); // FlowLayout(alignemnt, hori-gap,
                                                                                     // verti-gap)
        score_border.setBounds(0, 350, 200, 150); // (Coordinate(x-axis, y-axis, length, height))
        score_border.setBorder(new MatteBorder(1, 1, 1, 1, Color.black)); // MatteBorder(top, left, down, right, Color)
        // wait for tae input in score_test
        String score_test = "10000";
        JLabel score = new JLabel();
        score.setText("Score");
        score.setFont(score.getFont().deriveFont(25f));
        JLabel score_num = new JLabel();
        score_num.setText(score_test);
        score_num.setFont(score_num.getFont().deriveFont(25f));

        score_border.add(score);
        score_border.add(score_num);
        main_page.add(score_border);

        // * Panel for Guess
        JPanel guess_border = new JPanel(new FlowLayout(FlowLayout.CENTER, 70, 10));
        guess_border.setBounds(200, 350, 200, 150);
        guess_border.setBorder(new MatteBorder(1, 0, 1, 0, Color.black));
        // wait for tae input in guess_test
        String guess_test = "1";
        JLabel guess = new JLabel();
        guess.setText("Guess");
        guess.setFont(guess.getFont().deriveFont(25f));
        JLabel guess_num = new JLabel();
        guess_num.setText(guess_test);
        guess_num.setFont(guess_num.getFont().deriveFont(25f));

        guess_border.add(guess);
        guess_border.add(guess_num);
        main_page.add(guess_border);

        // * Panel for accuracy
        JPanel accuracy_border = new JPanel(new FlowLayout(FlowLayout.CENTER, 70, 10));
        accuracy_border.setBounds(400, 350, 200, 150);
        accuracy_border.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));
        // wait for tae input in accuracy_test
        String accuracy_test = "1";
        JLabel accuracy = new JLabel();
        accuracy.setText("Accuracy");
        accuracy.setFont(accuracy.getFont().deriveFont(25f));
        JLabel accuracy_num = new JLabel();
        accuracy_num.setText(accuracy_test);
        accuracy_num.setFont(accuracy_num.getFont().deriveFont(25f));

        accuracy_border.add(accuracy);
        accuracy_border.add(accuracy_num);
        main_page.add(accuracy_border);

        // * Create a button
        // ! Create a getPicture() here for left and right then change the ImageIcon or
        // ! just change the JButton

        // * set panel
        // large width*height (550x780)
        // medium (390x554)
        // small (110x156)
        JPanel border = new JPanel();
        border.setBounds(0, 350, 600, 150);
        border.setBackground(Color.gray);

        ImageIcon left_pic = new ImageIcon("Frontend/Unknown.jpg"); // setImage
        ImageIcon right_pic = new ImageIcon("Frontend/Unknown.jpg");
        JButton left_button = new JButton(left_pic);
        JButton right_button = new JButton(right_pic);
        left_button.setBounds(116, 80, 130, 180); // x-axis, y-axis, width, height
        right_button.setBounds(376, 80, 130, 180);

        main_page.add(left_button);
        main_page.add(right_button);

        // * Create Text Area

        // * Create a Message Using JTextPane

        // * make JFrame visible (need to be put last)

    }
}