package Frontend.utility;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class DisconnectMessage {

    /**
     * Shows a popup saying the player is disconnected
     *
     * @return int The response of the user.
     */
    public static int disconnected() {
        JFrame disconnect = new JFrame();
        JOptionPane.showMessageDialog(disconnect, "Internet Unstable or Disconnect, \nPlease Check Your Connection",
                "ALERT", JOptionPane.WARNING_MESSAGE);
        if (JOptionPane.OK_OPTION == 0) {
            return 1;
        } else
            return 0;
    }
}
