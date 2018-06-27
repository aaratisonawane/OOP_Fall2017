package com.company;

import java.util.Scanner;

public class RandomInt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a maximum positive number for random generation: ");
        int maxNumber = input.nextInt();

        double randomNum = Math.random()*(maxNumber + 1);
        System.out.println((int)randomNum);

    }
}
