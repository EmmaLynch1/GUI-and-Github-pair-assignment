import javax.swing.*;
import java.awt.*;
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
    private JLabel wordToGuess;
    private JLabel remainingGuessesLabel;
    GUIproject GUIProjectInstance;

    public GameScreen(GUIproject GUIProjectInstance) {
        this.GUIProjectInstance= GUIProjectInstance;
        setTitle("Hangman");
        setSize(400, 300);
        setBounds(400, 100, 600, 500);
        //initialize game logic
        gameLogic = new GameLogic(this,this.GUIProjectInstance);
        setVisible(true);
        updateWordToGuessLabel(gameLogic.getHiddenWord());
        updateHangmanPhoto(gameLogic.getRemainingGuesses());
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
                PopUpScreen popup = new PopUpScreen();
                popup.setVisible(true);
            }
        });
        aButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('A');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        bButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('B');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        cButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('C');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        dButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('D');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        eButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('E');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        fButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('F');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        gButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('G');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        hButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('H');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        iButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('I');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('J');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        kButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('K');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        lButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('L');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        mButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('M');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        nButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('N');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        oButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('O');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        pButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('P');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        qButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('Q');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        rButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('R');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        sButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('S');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        tButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('T');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        uButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('U');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        vButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('V');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        wButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('W');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('X');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        yButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('Y');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });
        zButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.handleButtonClick('Z');
                updateWordToGuessLabel(gameLogic.getHiddenWord());
            }
        });

    }
    //error
    public void updateRemainingGuessesLabel(int remainingGuesses){
        remainingGuessesLabel.setText("Remaining Guesses: "+ remainingGuesses);
    }
    public void updateWordToGuessLabel(String updatedHiddenWord) {
        wordToGuess.setText(updatedHiddenWord);
    }

    public void updateHangmanPhoto(int remainingGuesses){
        ImageIcon head = new ImageIcon(getClass().getResource("head.png"));
        ImageIcon stand = new ImageIcon(getClass().getResource("stand.png"));
        ImageIcon body = new ImageIcon(getClass().getResource("body.png"));
        ImageIcon left_arm = new ImageIcon(getClass().getResource("leftarm.png"));
        ImageIcon right_arm = new ImageIcon(getClass().getResource("rightarm.png"));
        ImageIcon left_leg = new ImageIcon(getClass().getResource("leftleg.png"));
        ImageIcon right_leg = new ImageIcon(getClass().getResource("rightleg.png"));
        if (remainingGuesses == 6) {
            imageLabel.setIcon(stand);
        }
        else if (remainingGuesses == 5) {
            imageLabel.setIcon(head);
        }
        else if (remainingGuesses == 4) {
            imageLabel.setIcon(body);
        }
        else if (remainingGuesses == 3) {
            imageLabel.setIcon(left_arm);
        }
        else if (remainingGuesses == 2) {
            imageLabel.setIcon(right_arm);
        }
        else if (remainingGuesses == 1) {
            imageLabel.setIcon(left_leg);
        }
        else if (remainingGuesses == 0) {
            imageLabel.setIcon(right_leg);
        }
        else {
            imageLabel.setIcon(stand);
        }
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        imageLabel = new JLabel();
        imageLabel.setPreferredSize(new Dimension(250,250));
        wordToGuess = new JLabel();
        remainingGuessesLabel = new JLabel();

    }
}
