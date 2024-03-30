import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameScreen extends JFrame {
    public void disposeGameFrame() {
        dispose();
    }
    private GameLogic gameLogic;
    private JButton mainPopup;
    private JPanel GameScreen;
    //THE KEYBOARD
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
        //initialize game logic
        gameLogic=new GameLogic();

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

        aButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('A');
            }
        });
        bButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('B');
            }
        });
        cButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('C');
            }
        });
        dButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('D');
            }
        });
        eButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('E');
            }
        });
        fButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('F');
            }
        });
        gButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('G');
            }
        });
        hButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('H');
            }
        });
        iButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('I');
            }
        });
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('J');
            }
        });
        kButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('K');
            }
        });
        lButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('L');
            }
        });
        mButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('M');
            }
        });
        nButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('N');
            }
        });
        oButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('O');
            }
        });
        pButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('P');
            }
        });
        qButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('Q');
            }
        });
        rButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('R');
            }
        });
        sButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('S');
            }
        });
        tButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('T');
            }
        });
        uButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('U');
            }
        });
        vButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('V');
            }
        });
        wButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('W');
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('X');
            }
        });
        yButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('Y');
            }
        });
        zButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('Z');
            }
        });
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
        imageLabel=new JLabel(new ImageIcon("stand.png"));
    }
}
