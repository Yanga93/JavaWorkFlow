import java.util.Arrays;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // instantiates a Scanner object
        Scanner sc = new Scanner(System.in);

        // prompts user to enter userInput
        System.out.println("Enter the limit:");

        //declares a variable that reads in a line of keyboard input.
        int userInput = sc.nextInt();

        //initialize the array
        int[] myArray = new int[userInput];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
          //  String var = Integer.toString(myArray[i]);
          //  System.out.println(myArray[var]);

            //var = "Fizz";
                if( i % 3 == 0){
                    myArray[i] = "fizz";
                }
                else if(i % 5){
                    myArray[i] = "Buzz";
                }
                else if (i % 3 && i % 5){
                    myArray[i] = "FizzBuzz";
                }
        }

       // System.out.println(Arrays.toString(myArray));

    }
}
