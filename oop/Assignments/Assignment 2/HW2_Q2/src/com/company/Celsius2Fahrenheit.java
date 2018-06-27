package com.company;

import java.util.Scanner;

public class Celsius2Fahrenheit {

    public static void main(String[] args) {

        double TFahrenheit;
        double TCelsius;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius : ");
        TCelsius = scan.nextDouble();

        TFahrenheit = TCelsius * 9/5 + 32;

        System.out.println(TCelsius + " Celsius is " + TFahrenheit + " Fahrenheit");

    }
}
