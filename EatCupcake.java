import java.util.Scanner;

public class EatCupcake {

    public static void main(String[] args) {

        // instantiates a Scanner object
        Scanner sc = new Scanner(System.in);

        // prompts the user for input
        System.out.println("Did anyone see you?");

        //declares a variable that reads in a line of keyboard input.
        String myString = sc.next().toLowerCase();

        switch (myString) {

            case "yes":
                System.out.println("Was it a boss/lover/parent?. ");
                String firstInput = sc.next().toLowerCase();

                if (firstInput.equals("yes")) {
                    System.out.println("Was it expensive?. ");
                    String secInput = sc.next().toLowerCase();

                    if (secInput.equals("yes")) {
                        System.out.println("Can you cut off the part that touched the floor?. ");
                        String insideInput = sc.next().toLowerCase();

                        if (insideInput.equals("yes")) {
                            System.out.println("EAT IT");

                        } else {
                            System.out.println("YOUR CALL");

                        }
                    } else {
                        System.out.println("Is it chocolate? ");
                        String chocInput = sc.next().toLowerCase();
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
                String stickyAns = sc.next().toLowerCase();

                if (stickyAns.equals("yes")) {
                    System.out.println("Is it a raw steak?. ");
                    String steakAns = sc.next().toLowerCase();

                    if (steakAns.equals("yes")) {
                        System.out.println("Are you a puma?.");
                        String pumaAns = sc.next().toLowerCase();
                        if (pumaAns.equals("yes")) {
                            System.out.println("EAT IT");
                        } else {
                            System.out.println("DON'T EAT IT");
                        }
                    } else {
                        System.out.println("Did the cat lick it?. ");
                        String lickAns = sc.next().toLowerCase();

                        if (lickAns.equals("yes")) {
                            System.out.println("Is your cat healthy?.");
                            String healthyAns = sc.next().toLowerCase();

                            if (healthyAns.equals("yes")) {
                                System.out.println("EAT IT");
                            } else {
                                System.out.println("YOUR CALL");
                            }
                        } else {
                            System.out.println("EAT IT");
                        }
                    }
                } else {
                    System.out.println("Is it an Emausaurus?. ");
                    String emaAns = sc.next().toLowerCase();

                    if (emaAns.equals("yes")) {
                        System.out.println("Are you a Megalosaurus?. ");
                        String megaAns = sc.next().toLowerCase();

                        if (megaAns.equals("yes")) {
                            System.out.println("EAT IT");
                        } else {
                            System.out.println("DON'T EAT IT");
                        }
                    } else {
                        System.out.println("Did the cat lick it");
                        String catAns = sc.next().toLowerCase();

                        if (catAns.equals("yes")) {
                            System.out.println("Is your cat healthy?. ");
                            String catHealthyAns = sc.next().toLowerCase();

                            if (catHealthyAns.equals("yes")) {
                                System.out.println("EAT IT");
                            } else {
                                System.out.println("YOUR CALL");
                            }
                        } else {
                            System.out.println("EAT IT. ");
                        }
                    }
                }

                break;


            default:
                System.out.println("Invalid input, either 'yes' or 'no'. ");
                break;
        }

    }
}


