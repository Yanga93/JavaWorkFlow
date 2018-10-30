import java.util.Scanner;

public class EatCupcake {

    public static void main(String[] args) {

        // instantiates a Scanner object
        Scanner sc = new Scanner(System.in);

        // prompts the user for input
        System.out.println("Did anyone see you?");

        //declares a variable that reads in a line of keyboard input.
        String myString = sc.next();

        switch (myString) {

            case "yes":
                System.out.println("Was it a boss/lover/parent?. ");
                String firstInput = sc.next();

                if (firstInput.equals("yes")) {
                    System.out.println("Was it expensive?. ");
                    String secInput = sc.next();

                    if (secInput.equals("yes")) {
                        System.out.println("Can you cut off the part that touched the floor?. ");
                        String insideInput = sc.next();

                        if (insideInput.equals("yes")) {
                            System.out.println("EAT IT");

                        } else {
                            System.out.println("YOUR CALL");

                        }
                    } else {
                        System.out.println("Is it chocolate? ");
                        String chocInput = sc.next();
                        if (chocInput.equals("yes")) {
                            System.out.println("EAT IT. ");
                        } else {
                            System.out.println("DON'T EAT IT");
                        }
                    }

                } else {
                    System.out.println("EAT IT. ");
                }

                break;


            case "no":
                System.out.println("Was it sticky?. ");

                break;


            default:
                System.out.println("Invalid input, either 'yes' or 'no'. ");
                break;
        }


    }
}


