import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PopUpScreen extends JFrame {
    private JButton HIGHSCORESButton;
    private JButton INSTRUCTIONSButton;
    private JButton GOBACKButton;
    private JPanel ingamePOPUP;
    private JButton QUITButton;
    private GameScreen gameScreen;
    public PopUpScreen() {
        setTitle("Popup");
        setSize(400, 300);
        setBounds(400, 100, 600, 500);
        GOBACKButton.addActionListener(new ActionListener() {
         @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        INSTRUCTIONSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        HIGHSCORESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        setContentPane(ingamePOPUP);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        QUITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            dispose();
            gameScreen.disposeGameFrame();
            }
        });
    }
}
