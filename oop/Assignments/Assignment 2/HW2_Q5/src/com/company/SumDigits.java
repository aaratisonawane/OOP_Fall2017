package com.company;

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number between 0 to 1000: ");
        int Number = scan.nextInt();

        int unit_digit = Number % 10;
        Number = Number/10;

        int tens_digit = Number % 10;
        Number = Number/10;

        int hundreds_digit = Number % 10;

        int sum = unit_digit + tens_digit + hundreds_digit;
        System.out.println("The sum of digits is: " + sum);
    }
}
