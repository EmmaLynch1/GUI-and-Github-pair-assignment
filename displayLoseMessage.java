import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class displayLoseMessage extends JFrame {
    private JButton BACKTOMAINMENUButton;
    private JButton QUITButton;
    private JPanel displayLoseMessage;
    private int score;
    public displayLoseMessage(int score) {
        setTitle("LOSE SCREEN");
        setSize(400, 300);
        setBounds(400, 100, 600, 500);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.score=score;
        BACKTOMAINMENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();


            }
        });
        QUITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "confirm", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }

            }
        });
        setContentPane(displayLoseMessage);
    }
}
