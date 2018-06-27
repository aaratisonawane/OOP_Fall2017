package com.company;

public class RecursionDemo{

    static int factorial(int n) {
        System.out.println("factorial:"+n);
        if (n==1) {
            return 1;
        }
        int res = n * factorial(n-1);
        System.out.println("res= "+res);
        return res;
    }

    static int fib(int n) {
        System.out.println("fib: "+n);
        if (n < 3) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    static int sumUpto(int n) {
        // sum from 1 through n
        if (n==1){
            return 1;
        }
        return n+sumUpto(n-1);
    }

    static int sumFromTo(int a, int b) {
        // sum from a to b inclusively
        if (a > b){
            return 0;
        }
        return a + sumFromTo(a+1,b);
    }

    static  void printAlphabetsTo(char ch){
        for(char i = 'A'; i <= ch; i++) {
            System.out.print(i);
        }
        System.out.println();
    }

    static void printAlphabetsRecTo(char ch) {
        if(ch=='A') {
            System.out.print('A');
        }
        else{
            printAlphabetsRecTo((char)(ch-1));
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(4)+"\n");

        System.out.println(fib(4)+"\n");

        System.out.println(sumUpto(4)+"\n");

        System.out.println(sumFromTo(2,5)+"\n");

        printAlphabetsTo('C');
        printAlphabetsRecTo('C');
    }
}
