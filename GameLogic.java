import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class GameLogic {
    String[] words = {"GIRAFFE", "ARCTIC", "HANGMAN", "SUPERCALIFRAGILISTICEXPIALIDOCIOUS", "XENOTRANSPLANTATION", "ENGLISH", "BASKETBALL", "GENERATION"};
    String chosenWord;

    String generateWord() {
        Random rand = new Random();
        int max = words.length;
        int min = 0;

        int randomNumber = rand.nextInt((max - min) + 1) + min; // Generate number from a min of 0 to a max of the words array

        chosenWord = words[randomNumber]; // Take random number and put it as the word that the main game will use

        return chosenWord;
    }

    // I am going to make this more elaborate later + not fully done
    boolean compareInputToChosenWord(String input) {
        if (chosenWord.contains(input)) {
            return true;
        }
        else {
            return false;
        }
    }
}