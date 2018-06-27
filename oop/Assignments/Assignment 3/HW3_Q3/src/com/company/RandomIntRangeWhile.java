package com.company;

import java.util.Scanner;

public class RandomIntRangeWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minNumber;
        int maxNumber;

        do {
            System.out.print("Enter the minimum and maximum positive number for random generation (same numbers to quit): ");
            minNumber = input.nextInt();
            maxNumber = input.nextInt();

            double randomNum = (Math.random() * (maxNumber - minNumber + 1)) + minNumber;
            System.out.println((int) randomNum);

        }while(minNumber!=maxNumber);
    }
}
