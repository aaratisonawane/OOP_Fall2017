package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numbers [][]={
                {"Tom", "555-3322"},
                {"Mary", "555-8976"},
                {"Jon", "555-1037"},
                {"Tom", "555-1400"},
        };
        int i;
        if (args.length !=1)
            System.out.println("Usage: java Phone ,<name>");
        else{
            for (i=0; i<numbers.length; i++){
                if(numbers[i][0].equals(args[0]))
                    System.out.println(numbers[i][1]);
            }
        }
    }
}
