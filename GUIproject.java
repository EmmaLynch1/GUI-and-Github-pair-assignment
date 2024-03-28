import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIproject extends JFrame {
    private JButton playButton;
    private JButton instructionsPopup;
    private JButton exitButton;
    private JPanel homeScreen;

    public GUIproject() {
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        instructionsPopup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            //confirm if user wants to exit program
            // need to ensure that the no makes the joption disapear and do nothing.
            public void actionPerformed(ActionEvent actionEvent) {
                int result= JOptionPane.showConfirmDialog(null,"Are you sure you want to quit?", "confirm", JOptionPane.YES_NO_OPTION);
                System.exit(0);
                if (result == JOptionPane.YES_OPTION) {
                    dispose();
                }
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
}

