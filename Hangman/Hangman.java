
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = new String[1];
        String myGuess = "";

        int gameOver = 0;

        System.out.println("Player One, enter a word:");
        String secreteWord = sc.next();

        for (int i = 0; i < words.length; i++) {
            words[i] = secreteWord;
            myGuess = words[i];
        }

        String underscore = new String(new char[myGuess.length()]).replace("\0", "_");

        System.out.println(underscore);

        int guessLimit = 8;



        while (gameOver < guessLimit && underscore.contains("_")) {
            System.out.println("Player Two, you have " + guessLimit + " guesses left. Enter a guess:");
            String guess = sc.next();


            String new_underscore = "";

            for (int i = 0; i < myGuess.length(); i++) {
                if (myGuess.charAt(i) == guess.charAt(0)) {
                    new_underscore += guess.charAt(0);
                } else if (underscore.charAt(i) != '_') {
                    new_underscore += myGuess.charAt(i);
                } else {
                    new_underscore += "_";
                }
            }

            if (underscore.contains(String.valueOf(guess))) {
                System.out.println("You have already guessed " + "'" + guess + "'.");
                System.out.println(underscore);
            } else if (underscore.equals(new_underscore)) {
                guessLimit--;
                if (gameOver < guessLimit) {
                    System.out.println(underscore);

                }

            } else {
                underscore = new_underscore;
                System.out.println(underscore);
            }

            if (underscore.equals(myGuess)) {
                System.out.println("Game over. Player Two wins!");
            } else if (gameOver == guessLimit) {
                System.out.println("Game over. Player One wins! The word was: " + myGuess);
            }
        }
        sc.close();
    }
}

