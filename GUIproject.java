import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIproject extends JFrame {
    private JButton playButton;
    private JButton instructionsPopup;
    private JButton exitButton;
    private JPanel homeScreen;
    private JLabel mainPic;
    private JButton HIGHSCORESButton;


    public GUIproject() {
        setTitle("HOME SCREEN");
        setSize(400, 300);
        setBounds(400, 100, 600, 500);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("here");
                GameScreen play = new GameScreen();
                play.setVisible(true);//open game form
                dispose();//close current

            }
        });
        instructionsPopup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //open instructions frame
                Instructions popup = new Instructions();
                popup.setVisible(true);


            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "confirm", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        setContentPane(homeScreen);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        HIGHSCORESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        GUIproject h= new GUIproject();
        h.setContentPane(h.homeScreen);
        h.setTitle("HANGMAN GAME");
        h.setBounds(400,100,600,500);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        mainPic=new JLabel(new ImageIcon("main.png"));
    }
}
