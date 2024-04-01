import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class displayWinMessage extends JFrame {
    private JButton logScoreAndGoButton;
    private JButton exitButton;
    private JPanel displayWinMessage;

    public displayWinMessage() {
        setTitle("WIN SCREEN");
        setSize(400, 300);
        setBounds(400, 100, 600, 500);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        logScoreAndGoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                GUIproject home = new GUIproject();
                home.setVisible(true);

            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
        setContentPane(displayWinMessage);
    }
}
