import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        // instantiates a Scanner object
        Scanner sc = new Scanner(System.in);
        int input2 = 0;

        // prompts player 1 for input
        System.out.println("Player One: Choose your weapon!");

        //declares a variable that reads in a line of keyboard input.
        int input1 = sc.nextInt();


        int score1 = 0;
        int score2 = 0;

        if (input1 == 4) {
            System.out.println("Player One and Player Two are tied with " + score1 + " points.");
            System.out.println("Quitting");
        } else {
            System.out.println("Good choice!");
            // prompts player 2 for input
            System.out.println("Player Two: Choose your weapon!");
            //declares a variable that reads in a line of keyboard input.
            input2 = sc.nextInt();

            if (input2 == 4) {
                System.out.println("Player One and Player Two are tied with " + score2 + " points.");
                System.out.println("Quitting");
            } else {
                System.out.println("Good choice!");
            }
        }

        while ((input1 != 4) && (input2 != 4)) {


            switch (input1) {
                case 1:
                    System.out.println("Player One chose: rock");
                    break;
                case 2:
                    System.out.println("Player One chose: paper");
                    break;
                case 3:
                    System.out.println("Player One chose: scissors");
                    break;

            }

            switch (input2) {

                case 1:
                    System.out.println("Player Two chose: rock");
                    break;
                case 2:
                    System.out.println("Player Two chose: paper");
                    break;
                case 3:
                    System.out.println("Player Two chose: scissors");
                    break;

            }


            // rock vs paper === paper wins
            if (input1 == 1 && input2 == 2) {
                score2 = score2 + 1;
                System.out.println("Player Two Wins!");

            }
            // paper vs rock == paper wins
            else if (input1 == 2 && input2 == 1) {
                score1 = score1 + 1;
                System.out.println("Player One Wins!");
            }
            // paper vs scissors: scissors win
            else if (input1 == 2 && input2 == 3) {
                score2 = score2 + 1;
                System.out.println("Player Two Wins!");
            }
            // rock vs scissors: rock wins
            else if (input1 == 1 && input2 == 3) {
                score1 = score1 + 1;
                System.out.println("Player One Wins!");
            }
            // scissors vs rock: rock wins
            else if (input1 == 3 && input2 == 1) {
                score2 = score2 + 1;
                System.out.println("Player Two Wins!");
            }
            // scissors vs paper == scissors win
            else if (input1 == 3 && input2 == 2) {
                score1 = score1 + 1;
                System.out.println("Player One Wins!");

            } else {
                score1 = score2;
                System.out.println("It's a draw!");
                //System.out.println("Player One and Player Two are tied with " + score1 + " points.");

            }

            System.out.println("The score is now:" + " " + score1 + " - " + score2);

            // prompts player 1 for input
            System.out.println("Player One: Choose your weapon!");

            //declares a variable that reads in a line of keyboard input.
            input1 = sc.nextInt();


            if (input1 == 4) {

                if (score1 > score2) {
                    System.out.println("The winner is Player One with " + score1 + " points.");
                    System.out.println("Quitting");
                } else if (score1 < score2) {
                    System.out.println("The winner is Player Two with " + score2 + " points.");
                    System.out.println("Quitting");
                } else {
                    System.out.println("Player One and Player Two are tied with " + score1 + " points.");
                    System.out.println("Quitting");
                }
            } else {
                System.out.println("Good choice!");
                // prompts player 2 for input
                System.out.println("Player Two: Choose your weapon!");
                //declares a variable that reads in a line of keyboard input.
                input2 = sc.nextInt();

                if (input2 == 4) {
                    if (score1 > score2) {
                        System.out.println("The winner is Player One with " + score1 + " points.");
                        System.out.println("Quitting");
                    } else if (score1 < score2) {
                        System.out.println("The winner is Player Two with " + score2 + " points.");
                        System.out.println("Quitting");
                    } else {
                        System.out.println("Player One and Player Two are tied with " + score1 + " points.");
                        System.out.println("Quitting");
                    }

                } else {
                    System.out.println("Good choice!");
                }
            }

        }

    }
}


