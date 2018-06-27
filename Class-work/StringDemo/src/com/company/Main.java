package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String strs[] = {"This", "is", "a", "test."};
        System.out.println("original array: ");
        for(String s : strs)
            System.out.print(s+" ");
        System.out.println("\n");

        //change a string
        strs[1] = "was";
        strs[3] = "test,tool!";
        System.out.println("Modified Array: ");
        for(String s: strs)
            System.out.print(s+" ");

    }
}
