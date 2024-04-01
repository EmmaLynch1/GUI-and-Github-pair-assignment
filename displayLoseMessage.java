import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class displayLoseMessage extends JFrame {
    private JButton BACKTOMAINMENUButton;
    private JButton QUITButton;
    private JPanel displayLoseMessage;

    public displayLoseMessage() {
        setTitle("LOSE SCREEN");
        setSize(400, 300);
        setBounds(400, 100, 600, 500);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        BACKTOMAINMENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                GUIproject home = new GUIproject();
                home.setVisible(true);

            }
        });
        QUITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
        setContentPane(displayLoseMessage);
    }
}
