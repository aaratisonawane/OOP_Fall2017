import java.util.Scanner;

public class Distance {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sides");
        int x1 = scan.nextInt();;
        int y1 = scan.nextInt();;
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();;
        int d1 = x1 - x2;
        int d2 = y1 - y2;


        double distance = Math.sqrt(d1*d1 +d2*d2);
        System.out.println("Distance is " + distance);

    }
}
