import java.util.Arrays;
import java.util.Scanner;

public class DiagonalAdd {
    public static void main(String[] args) {

        // instantiates a Scanner object
        Scanner sc = new Scanner(System.in);

        // prompts user to enter userInput
        System.out.println("Enter the side length:");

        //declares a variable that reads in a line of keyboard input.
        int userInput = sc.nextInt();

        // The length of the side
        int sideLength = userInput;


        //set the total sum of diagonals
        int sumDiagonals = 0;

        //initialize the array
        int[][] myArray = new int[userInput][sideLength];

        System.out.println("The array crated is:");

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length ; j++) {
                myArray[i][j] = i + j;

                myArray[i][j] = (i >= 1 ) ? sideLength++ :  myArray[i][j];
            }
        }
        System.out.println(Arrays.deepToString(myArray));

        for (int i = 0; i < myArray.length; i++) {

            sumDiagonals += myArray[i][i];
        }
        System.out.println("The sum of the diagonal is: \n" + sumDiagonals);
    }
}

