import java.util.Random;
/*
class GameLogic {
    String[] words = {"GIRAFFE", "ARCTIC", "HANGMAN", "SUPERCALIFRAGILISTICEXPIALIDOCIOUS", "XENOTRANSPLANTATION", "ENGLISH", "BASKETBALL", "GENERATION"};
    String chosenWord;

    static String generateWord() {
        Random rand = new Random();
        int max = words.length - 1;
        int min = 0;

        int randomNumber = rand.nextInt((max - min) + 1) + min; // Generate number from a min of 0 to a max of the words array
        
        chosenWord = words[randomNumber]; // Take random number and put it as the word that the main game will use

        return chosenWord;
    }

    // I am going to make this more elaborate later + not fully done
    static boolean compareInputToChosenWord(String input, String hiddenWord) {
        if (hiddenWord.contains(input)) {
            return true;
        }
        else {
            return false;
        }

    }
}
*/

public class GameLogic {

    private String chosenWord;
    private String hiddenWord;
    private int remainingGuesses;

    public GameLogic() {
        chosenWord = generateWord();
        initializeHiddenWord();
        //set initial number of guesses/amount of body parts
        remainingGuesses = 6;
    }

    private String generateWord() {
        String[] words={"GIRAFFE", "ARCTIC", "HANGMAN", "SUPERCALIFRAGILISTICEXPIALIDOCIOUS", "XENOTRANSPLANTATION", "ENGLISH", "BASKETBALL", "GENERATION"};
        Random rand = new Random();
        int randomNumber= rand.nextInt(words.length);
        return words[randomNumber];}
    private void initializeHiddenWord() {
        hiddenWord = chosenWord.replaceAll("[A-Z]", "_");// let underscores represent un guessed letters
    }
    public String getHiddenWord() {
        return hiddenWord;
    }
    public int getRemainingGuesses(){
        return remainingGuesses;
    }
    //create method for handling guess, that will pass the letters from keyboard
    public boolean makeGuess(char guessedLetter){
        guessedLetter= Character.toUpperCase(guessedLetter);
        //identify if the letter is in the chosen/hidden word
        //if char is not found, index returns to -1
        if (chosenWord.indexOf(guessedLetter)!= -1){
            //this is if it is correct
            StringBuilder updatedHiddenWord=new StringBuilder(hiddenWord); //this allows us to mutate previous string
            for (int i=0; i<chosenWord.length();i++){
                if (chosenWord.charAt(i) ==guessedLetter) {
                    updatedHiddenWord.setCharAt(i, guessedLetter);
                }
            }
            hiddenWord=updatedHiddenWord.toString();
            return true;//correct guess
        }else{
            //incorrect guess
            remainingGuesses--;
            return false;
        }
    }
}
