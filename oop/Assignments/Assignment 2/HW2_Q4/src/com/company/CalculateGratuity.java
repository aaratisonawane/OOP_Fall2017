package com.company;

import java.util.Scanner;

public class CalculateGratuity {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Subtotal and a gratuity rate: " );
        double sub_total = scan.nextDouble();
        double gratuity_rate = scan.nextDouble();

        double Gratuity = (gratuity_rate/100) * sub_total;

        double Total = sub_total + Gratuity;

        System.out.println("The gratuity is " + Gratuity + " and the total is " + Total);

    }
}
