import java.util.Random;
public class GameLogic {

    private String chosenWord;
    private String hiddenWord;
    private int remainingGuesses;
    private GameScreen gameScreen;

    public GameLogic(GameScreen gameScreen) {
        this.gameScreen=gameScreen;
        chosenWord = generateWord();
        initializeHiddenWord();
        //set initial number of guesses/amount of body parts
        remainingGuesses = 6;
    }

    private String generateWord() {
        String[] words = {"GIRAFFE", "ARCTIC", "HANGMAN", "SUPERCALIFRAGILISTICEXPIALIDOCIOUS", "XENOTRANSPLANTATION", "ENGLISH", "BASKETBALL", "GENERATION"};
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
            if (hiddenWord.equals(chosenWord)){
                displayWinMessage winMessage = new displayWinMessage();
                winMessage.setVisible(true);
                gameScreen.disposeGameFrame();
            }
            return true;//correct guess
        } else {
            //incorrect guess
            remainingGuesses--;
            gameScreen.updateRemainingGuessesLabel(getRemainingGuesses());
            if (remainingGuesses==0){
                displayLoseMessage();
                gameScreen.dispose();
            }
            return false;
        }
    }
    //method to handle button click
    public void handleButtonClick(char letter) {
        makeGuess(letter);


    }
    private void displayLoseMessage(){
        displayLoseMessage loseMessage=new displayLoseMessage();
        loseMessage.setVisible(true);
    }
    private void updateWordToGuessLabel(String updatedHiddenWord) {
        if (gameScreen != null) {
            gameScreen.updateWordToGuessLabel(updatedHiddenWord);
}
    }
}
