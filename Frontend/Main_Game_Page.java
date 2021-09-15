import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.border.MatteBorder; // extra modify for border
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main_Game_Page {

        Main_Game_Page() {
                JFrame main_page = new JFrame();

                // * Setting Frame Size and etc
                main_page.setSize(600, 500); // size (length, height)
                main_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Program Terminate Upon close
                main_page.setLayout(null);

                // * set Title
                main_page.setTitle("Higher or Lower");

                //// * (button for back)
                JButton back_button = new JButton("Main Menu");
                back_button.setBounds(10, 10, 100, 20);
                main_page.add(back_button);

                // * Create Text Area
                //// * Text for Instruction
                JPanel instruction_panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
                instruction_panel.setBounds(150, 0, 300, 80);

                JLabel instruction_text = new JLabel(
                                "<html><p{text-alignment: center;} style=\"font-size:18px\"> Which of the 2 <BR> anime is more popular?</p></html>");
                instruction_panel.add(instruction_text);

                main_page.add(instruction_panel);
                //// * Anime title

                // * Create a button
                // ! Create a getPicture() here for left and right then change the ImageIcon or
                // ! just change the JButton

                //// * set panel (button for image)
                // large width*height (550x780)
                // medium (390x554)
                // small (110x156)

                ImageIcon left_pic = new ImageIcon("Frontend/Unknown.jpg"); // setImage
                ImageIcon right_pic = new ImageIcon("Frontend/Unknown.jpg");
                JButton left_button = new JButton(left_pic);
                JButton right_button = new JButton(right_pic);
                left_button.setBounds(116, 80, 130, 180); // x-axis, y-axis, width, height
                right_button.setBounds(376, 80, 130, 180);

                main_page.add(left_button);
                main_page.add(right_button);

                // * Create Border
                // * Panel for score
                JPanel score_border = new JPanel(new FlowLayout(FlowLayout.CENTER, 70, 10)); // FlowLayout(alignemnt,
                                                                                             // hori-gap,
                                                                                             // verti-gap)
                score_border.setBounds(0, 350, 200, 150); // (Coordinate(x-axis, y-axis, length, height))
                score_border.setBorder(new MatteBorder(1, 1, 1, 1, Color.black)); // MatteBorder(top, left, down, right,
                                                                                  // Color)
                // wait for tae input in score_test
                String score_test = "10000";
                JLabel score = new JLabel(Utils.toHTML(
                                "<p style='font-size:20px; text-align:center;'>Score<br />" + score_test + "</p>"));

                score_border.add(score);
                main_page.add(score_border);

                // * Panel for Guess
                JPanel guess_border = new JPanel(new FlowLayout(FlowLayout.CENTER, 70, 10));
                guess_border.setBounds(200, 350, 200, 150);
                guess_border.setBorder(new MatteBorder(1, 0, 1, 0, Color.black));
                // wait for tae input in guess_test
                String guess_test = "1";
                JLabel guess = new JLabel(Utils.toHTML(
                                "<p style='font-size:20px; text-align:center;'>Guess<br />" + guess_test + "</p>"));

                guess_border.add(guess);
                main_page.add(guess_border);

                // * Panel for accuracy
                JPanel accuracy_border = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));
                accuracy_border.setBounds(400, 350, 200, 150);
                accuracy_border.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));
                // wait for tae input in accuracy_test
                String accuracy_test = "10000";
                JLabel accuracy = new JLabel(Utils.toHTML("<p style='font-size:20px; text-align:center;'>Accuracy<br />"
                                + accuracy_test + "</p>"));

                accuracy_border.add(accuracy);
                main_page.add(accuracy_border);

                // * make JFrame visible (need to be put last)
                main_page.setVisible(true);
        }
}