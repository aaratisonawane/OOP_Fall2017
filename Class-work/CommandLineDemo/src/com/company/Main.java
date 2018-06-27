package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("These are "+args.length+ "command line arguments.");
        System.out.println("They are: ");
        for(int i = 0; i<args.length; i++)
            System.out.println("args{"+ i + "]: "+ args[i]);
    }
}
