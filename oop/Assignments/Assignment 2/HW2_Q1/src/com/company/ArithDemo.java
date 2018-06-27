package com.company;

public class ArithDemo {

    public static void main(String[] args) {

        System.out.println("(1)" + " 42 / 5 = " + 42d / 5d);
        System.out.println("(2)" + " 42.0 / 5 = " + 42.0 / 5);
        System.out.println("(3)" + " 42 % 5 = " + 42 % 5);
        System.out.println("(4)" + " 40 % 5 = " + 40 % 5);
        System.out.println("(5)" + " 1 % 2 = " + 1 % 2);
        System.out.println("(6)" + " 2 % 1 = " + 2 % 1);
        System.out.println("(7)" + " 45 + 4*4 - 2 = " + (45 + 4*4 - 2));
        System.out.println("(8)" + " 45 + 43 % 5 * (23 * 3 % 2) = " + (45 + 43 % 5 * (23 * 3 % 2)));
        System.out.println("(9)" + " Math.sqrt(10) = " + Math.sqrt(10));
        System.out.println("(10)" + " Math.pow(5,2) = " + Math.pow(5,2));
        System.out.println("(11)" + " Math.pow(20.0,100) = " + Math.pow(20.0,100));
        System.out.println("(12)" + " Math.pow(20.0,1000) = " + Math.pow(20.0,1000));
        System.out.println("(13)" + " Math.pow(0.1,300) = " + Math.pow(0.1,300));
        System.out.println("(14)" + " Math.pow(0.1,400) = " + Math.pow(0.1,400));

        double x = 10;
        double y = 20;
        double a = 30;
        double b = 40;
        double c = 50;
        double ans1 = (3+4*x)/5 - (10*(y-5)*(a+b+c))/x + 9*(4/x+(9+x)/y);
        System.out.println("(15)" + " (3+4*x)/5 - (10*(y-5)*(a+b+c))/x + 9*(4/x+(9+x)/y) = " + ans1 );

        c = 100;
        x = y = a = b = c;
        double ans2 = (3+4*x)/5 - (10*(y-5)*(a+b+c))/x + 9*(4/x+(9+x)/y);
        System.out.println("(16)" + " (3+4*x)/5 - (10*(y-5)*(a+b+c))/x + 9*(4/x+(9+x)/y) = " + ans2 );

    }
}

