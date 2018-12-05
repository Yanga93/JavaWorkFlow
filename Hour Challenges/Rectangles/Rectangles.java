import java.util.Scanner;

public class Rectangles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //prompt the user for width
        System.out.println("Please enter a width:");

        int width = sc.nextInt();

        // prompt the user for height
        System.out.println("Please enter a height:");

        int height = sc.nextInt();

        String holder = "";

        if (height >= 1 && width >= 1) {

            if (width == height) {
                for (int i = 1; i <= width; i++) {
                    for (int j = 1; j <= height; j++) {
                        holder += "*";
                    }
                    holder += "\n";
                }
                System.out.println(holder);
            } else if (height > width) {
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= width; j++) {
                        holder += "#";
                    }
                   holder += "\n";
                }
                System.out.println(holder);
            } else if (height < width) {
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= width; j++) {
                        holder += "$";
                    }
                    holder += "\n";
                }

                System.out.print(holder);
            }
        } else {
            // System.out.println(holder);
        }
    }
}
