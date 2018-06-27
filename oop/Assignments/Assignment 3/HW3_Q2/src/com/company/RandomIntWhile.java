package com.company;

import java.util.Scanner;

public class RandomIntWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNumber;

        do{
            System.out.print("Enter a maximum positive number for random generation (0 to Quit): ");
            maxNumber = input.nextInt();

            double randomNum = (maxNumber + 1) * Math.random();
            System.out.println((int) randomNum);

        }while(maxNumber != 0);


    }
}
