import java.util.Scanner;

public class Hypot {
    public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the sides");
            int side1 = scan.nextInt();
            int side2 = scan.nextInt();
            //int side1 = 3;
            // int side2 = 4;
            double hypot;

            hypot = Math.sqrt(side1 * side1 + side2 * side2);
            System.out.println("Hypotenuse of triangle is " + hypot);
        }
}
