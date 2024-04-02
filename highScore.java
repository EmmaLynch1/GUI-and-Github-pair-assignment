import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
public class highScore extends JFrame {

    private JButton button1;
    private JPanel highScore;
    private JTextArea HighScoreTextArea;

    public highScore(List<ScoreEntry> highScores) {
        setTitle("Highscores");
        setSize(400, 300);
        setBounds(400, 100, 600, 500);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            dispose();
            }
        });
        setContentPane(highScore);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        displayHighScores(highScores);
        }
    private void displayHighScores(List<ScoreEntry> highScores){
        StringBuilder sb = new StringBuilder();
        sb.append("High Scores:\n");
        for(ScoreEntry entry: highScores){
            System.out.print(entry.getPlayerName());
            System.out.print(entry.getScore());
            sb.append(entry.getPlayerName()).append(": ").append(entry.getScore()).append("\n");
        }
        HighScoreTextArea.setText(sb.toString());
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        HighScoreTextArea = new JTextArea();
    }
}

