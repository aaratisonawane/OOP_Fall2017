package com.company;

public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Prime numbers are...");

        for (int num = 2; num < 100; num++) {
            int count = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count = 1;
                }

            }
            if(count == 0){
                System.out.print(num + ",");
            }
        }
    }
}
