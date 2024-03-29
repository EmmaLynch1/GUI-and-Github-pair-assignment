
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Instructions extends JFrame{
    private JButton GOBACKButton;
    private JPanel instructions;


    public Instructions() {
        setTitle("Instructions");
        setSize(400, 300);
        setBounds(400, 100, 600, 500);
        GOBACKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            dispose();
            }
        });
        setContentPane(instructions);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    }


