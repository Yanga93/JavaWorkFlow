import java.util.Scanner;

public class EatCupcake {

    public static void main(String[] args) {

        // instantiates a Scanner object
        Scanner sc = new Scanner(System.in);

        // prompts the user for input
        System.out.println("Did anyone see you?");

        //declares a variable that reads in a line of keyboard input.
        String myString = sc.next().toUpperCase();

        switch (myString) {

            case "YES.":
                System.out.println("Was it a boss/lover/parent?");
                String firstInput = sc.next().toUpperCase();

                if (firstInput.equals("YES.")) {
                    System.out.println("Was it expensive?");
                    String secInput = sc.next().toUpperCase();

                    if (secInput.equals("YES.")) {
                        System.out.println("Can you cut off the part that touched the floor?");
                        String insideInput = sc.next().toUpperCase();

                        if (insideInput.equals("YES.")) {
                            System.out.println("EAT IT.");

                        } else {
                            System.out.println("YOUR CALL");

                        }
                    } else {
                        System.out.println("Is it chocolate?");
                        String chocInput = sc.next().toUpperCase();
                        if (chocInput.equals("YES.")) {
                            System.out.println("EAT IT.");
                        } else {
                            System.out.println("DON'T EAT IT");
                        }
                    }

                } else {
                    System.out.println("EAT IT.");
                }

                break;


            case "NO.":
                System.out.println("Was it sticky?");
                String stickyAns = sc.next().toUpperCase();

                if (stickyAns.equals("YES.")) {
                    System.out.println("Is it a raw steak?");
                    String steakAns = sc.next().toUpperCase();

                    if (steakAns.equals("YES.")) {
                        System.out.println("Are you a puma?.");
                        String pumaAns = sc.next().toUpperCase();
                        if (pumaAns.equals("YES.")) {
                            System.out.println("EAT IT.");
                        } else {
                            System.out.println("DON'T EAT IT");
                        }
                    } else {
                        System.out.println("Did the cat lick it?");
                        String lickAns = sc.next().toUpperCase();

                        if (lickAns.equals("YES.")) {
                            System.out.println("Is your cat healthy?");
                            String healthyAns = sc.next().toUpperCase();

                            if (healthyAns.equals("YES.")) {
                                System.out.println("EAT IT.");
                            } else {
                                System.out.println("YOUR CALL");
                            }
                        } else {
                            System.out.println("EAT IT.");
                        }
                    }
                } else {
                    System.out.println("Is it an Emausaurus?");
                    String emaAns = sc.next().toUpperCase();

                    if (emaAns.equals("YES.")) {
                        System.out.println("Are you a Megalosaurus?");
                        String megaAns = sc.next().toUpperCase();

                        if (megaAns.equals("YES.")) {
                            System.out.println("EAT IT.");
                        } else {
                            System.out.println("DON'T EAT IT");
                        }
                    } else {
                        System.out.println("Did the cat lick it?");
                        String catAns = sc.next().toUpperCase();

                        if (catAns.equals("YES.")) {
                            System.out.println("Is your cat healthy?");
                            String catHealthyAns = sc.next().toUpperCase();

                            if (catHealthyAns.equals("YES.")) {
                                System.out.println("EAT IT.");
                            } else {
                                System.out.println("YOUR CALL");
                            }
                        } else {
                            System.out.println("EAT IT.");
                        }
                    }
                }

                break;


            default:
                break;
        }

    }
}


