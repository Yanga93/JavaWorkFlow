import java.util.Arrays;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // instantiates a Scanner object
        Scanner sc = new Scanner(System.in);

        // prompts user to enter userInput
        System.out.println("Enter the limit:");

        //declares a variable that reads in a line of keyboard input.
        int limit = sc.nextInt();

        //initialize the array
        String [] myArray = new String[limit];

        for (int i = 1; i <= limit; i++) {
            myArray[i-1] = Integer.toString(i);

            if ((i % 3 == 0) && (i % 5 == 0)){
                myArray[i -1] =  "FizzBuzz";
            }
            else if(i % 3 == 0){
                myArray[i-1] = "Fizz";
            }
            else if(i % 5 == 0){
                myArray[i-1] = "Buzz";
            }
            else{
                myArray[i-1] = Integer.toString(i);
            }
        }

        System.out.println(Arrays.toString(myArray));

    }
}
