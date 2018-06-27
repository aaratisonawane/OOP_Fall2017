package com.company;

import java.util.Scanner;

public class NumInfo {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.print("Enter a positive digit number: ");
      int number = input.nextInt();

      if(isEven(number)){
          System.out.println(number + " is an even number");
      }else{
          System.out.println(number + " is an odd number");
      }

        if(isPrime(number)){
            System.out.println(number + " is a prime number");
        }else{
            System.out.println(number + " is NOT a prime number");

            System.out.print("The factors are ");
            printFactors(number);

            System.out.println();

            System.out.print("The prime factors are ");
            printPrimeFactors(number);

        }
    }

    public static boolean isEven(int number) {

        return (number%2 == 0);
    }

    public  static boolean isPrime(int number) {
        if(number == 1 || number == 0){
            return false;
        }
        if(number == 2){
            return true;
        }
        else{
            for(int i = 2; i < number; i++){
                if(number % i == 0) {
                    return false;
                }
            }
            return  true;
        }

    }

    public static void printFactors(int number) {
        for (int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    public static void printPrimeFactors(int number) {
        for (int i = 2; i <= number; i++){
            if(number % i == 0){
                if(isPrime(i)){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
