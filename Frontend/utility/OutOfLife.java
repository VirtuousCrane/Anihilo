package Frontend.utility;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class OutOfLife {
    /**
     * Shows the player a popup notifying they died
     *
     * @return int The response of the user
     */
    public static int life_0() {
        JFrame died = new JFrame();
        JOptionPane.showMessageDialog(died, "Game Over, Your Score is " + Score_Changer.score_text, "ALERT",
                JOptionPane.WARNING_MESSAGE);
        if (JOptionPane.OK_OPTION == 0) {
            return 1;
        } else
            return 0;
    }
}
