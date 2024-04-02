import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PopUpScreen extends JFrame {
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
                Instructions popup = new Instructions();
                popup.setVisible(true);
            }
        });

        setContentPane(ingamePOPUP);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        QUITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "confirm", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }
}// have to ensure exit button closes game frame
