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


}}
*/