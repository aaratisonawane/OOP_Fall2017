package com.company;

import java.util.Scanner;

public class FeetInch2cm{

    public static void main(String[] args) {
        Scanner integer = new Scanner(System.in);

        System.out.print("Enter height in feet and inches: ");

        double feet = integer.nextDouble();
        double inches = integer.nextDouble();

        double cm = ((feet*12)+ inches) * 2.54;

        System.out.println("It is " + cm + "cm");

    }
}