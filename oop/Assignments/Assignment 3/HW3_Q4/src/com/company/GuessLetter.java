package com.company;



public class GuessLetter {

    public static void main(String[] args) throws java.io.IOException {

        char minLetter = 'A';
        char maxLetter = 'Z';
        char letter;
        int count = 0;
        double randomLetter = (maxLetter + 1 - minLetter) * Math.random() + minLetter;
        char random = (char) randomLetter;

        do{
            if(count != 1){
                System.out.print("I'm thinking of a letter between A and Z. Enter your guess: ");
            }
            letter = (char) System.in.read();

            if((int) letter == 10){
                count = 1;
                continue;
            }
            if ((int)letter < (int) random){
                System.out.println("Guess higher");
            }else if((int)letter > (int) random){
                System.out.println("Guess lower");
            }
            count = 0;
        }while ((int)letter != (int) random);

        System.out.println("****Right****");
    }
}