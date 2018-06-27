import java.util.Scanner;
public class C_MileToC_Inches {


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the miles");
        long miles = scan.nextInt();
        long feet = 5280 * miles;
        long inches = 12 * feet;
        long cubicMile = miles * miles * miles;
        long cubicInches = inches * inches * inches;





        System.out.println("1 mile is 5280 feet");
        System.out.println("1 foot is 12 inches");
        System.out.println(miles + " mile is " + inches + " inches");
        System.out.println(cubicMile + " cubic mile is " + cubicInches + " cubic inches");

    }
    }
