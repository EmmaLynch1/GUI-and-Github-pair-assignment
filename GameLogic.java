import javax.swing.*;
import java.util.Random;
public class GameLogic {

    private String chosenWord;
    private String hiddenWord;
    private int remainingGuesses;
    private GameScreen gameScreen;
    private GUIproject guiProject;
    private int score;
    private String incorrectLetters;
    public GameLogic(GameScreen gameScreen, GUIproject guiProject) {
        this.gameScreen=gameScreen;
        this.guiProject= guiProject;
        chosenWord = generateWord();
        initializeHiddenWord();
        //set initial number of guesses/amount of body parts
        remainingGuesses = 6;
        gameScreen.updateRemainingGuessesLabel(getRemainingGuesses());
        //initialize score to 0 when game starts
        score=0;
        incorrectLetters= "";
    }

    private String generateWord() {
        String[] words = {"GIRAFFE", "ARCTIC", "HANGMAN", "HELLO", "KEYBOARD", "ENGLISH", "BASKETBALL", "GENERATION", "PIANO","MOUSE","RHINO","LION","SPEAKER","STRAW" +
                "LIGHT", "PANDA", "PHONE","SCHOOL", "PHYSICS"};
        Random rand = new Random();
        int randomNumber = rand.nextInt(words.length);
        return words[randomNumber];
    }

    private void initializeHiddenWord() {
        hiddenWord = chosenWord.replaceAll("[A-Z]", "_");
        gameScreen.updateWordToGuessLabel(hiddenWord);
    }

    public String getHiddenWord() {
        return hiddenWord;
    }

    public int getRemainingGuesses() {
        return remainingGuesses;
    }
    private String getPlayerName(){
        return JOptionPane.showInputDialog(null, "Enter your name:", "Player Name", JOptionPane.PLAIN_MESSAGE);
    }
    private int calculateScore(){
        int remainingGuesses = getRemainingGuesses();
        int baseScore=50;
        int score = baseScore + (remainingGuesses*20);
        return score;
    }

    //create method for handling guess, that will pass the letters from keyboard
    public boolean makeGuess(char guessedLetter) {
        guessedLetter = Character.toUpperCase(guessedLetter);
        //identify if the letter is in the chosen/hidden word
        //if char is not found, index returns to -1
        System.out.print(hiddenWord);
        if (chosenWord.indexOf(guessedLetter) != -1) {
            //this is if it is correct
            StringBuilder updatedHiddenWord = new StringBuilder(hiddenWord); //this allows us to mutate previous string
            for (int i = 0; i < chosenWord.length(); i++) {
                if (chosenWord.charAt(i) == guessedLetter) {
                    updatedHiddenWord.setCharAt(i, guessedLetter);

                }
            }
            hiddenWord = updatedHiddenWord.toString();
            updateWordToGuessLabel(hiddenWord);
            //handle win
            if (hiddenWord.equals(chosenWord)){
                score = calculateScore();
                String playerName= getPlayerName();
                guiProject.updateHighScores(playerName,calculateScore());
                displayWinMessage winMessage = new displayWinMessage(score);
                winMessage.setVisible(true);
                gameScreen.disposeGameFrame();
            }
            return true;//correct guess
        } else {
            //handle lose
            remainingGuesses--;
            gameScreen.updateRemainingGuessesLabel(getRemainingGuesses());
            gameScreen.updateHangmanPhoto(getRemainingGuesses());
            if (remainingGuesses==0){
                score= calculateScore();
                String playerName= getPlayerName();
                guiProject.updateHighScores(playerName,calculateScore());
                displayLoseMessage(score);
                gameScreen.dispose();
            }
            return false;
        }
    }
    //method to handle button click
    public void handleButtonClick(char letter) {
        makeGuess(letter);


    }

    private void displayLoseMessage(int score){
        displayLoseMessage loseMessage=new displayLoseMessage(score);
        loseMessage.setVisible(true);
    }
    private void updateWordToGuessLabel(String updatedHiddenWord) {
        if (gameScreen != null) {
            gameScreen.updateWordToGuessLabel(updatedHiddenWord);
}
    }
}
