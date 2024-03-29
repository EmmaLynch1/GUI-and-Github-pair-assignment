import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameScreen extends JFrame {
    private JButton mainPopup;
    private JPanel GameScreen;

    public GameScreen() {
        setTitle("Hangman");
        setSize(400, 300);
        setBounds(400, 100, 600, 500);
        mainPopup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        setContentPane(GameScreen);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
