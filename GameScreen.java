import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameScreen extends JFrame {
    public void disposeGameFrame() {
        dispose();
    }
    private JButton mainPopup;
    private JPanel GameScreen;
    private JButton vButton;
    private JButton hButton;
    private JButton wButton;
    private JButton xButton;
    private JButton pButton;
    private JButton qButton;
    private JButton bButton1;
    private JButton cButton1;
    private JButton dButton1;
    private JButton eButton1;
    private JButton fButton1;
    private JButton gButton;
    private JButton aButton1;
    private JButton kButton;
    private JButton jButton;
    private JButton iButton;
    private JButton lButton;
    private JButton mButton;
    private JButton nButton;
    private JButton oButton;
    private JButton yButton;
    private JButton rButton;
    private JButton sButton;
    private JButton tButton;
    private JButton uButton;
    private JButton zButton;
    private JLabel imageLabel;


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

        //in game popup
        mainPopup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PopUpScreen popup=new PopUpScreen();
                popup.setVisible(true);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        imageLabel=new JLabel(new ImageIcon("stand.png"));
    }
}
