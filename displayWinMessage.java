import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class displayWinMessage extends JFrame {
    private JButton logScoreAndGoButton;
    private JButton exitButton;
    private JPanel displayWinMessage;
    private int score;
    public displayWinMessage(int score) {
        setTitle("WIN SCREEN");
        setSize(400, 300);
        setBounds(400, 100, 600, 500);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.score =score;
        logScoreAndGoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "confirm", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        setContentPane(displayWinMessage);
    }
}
