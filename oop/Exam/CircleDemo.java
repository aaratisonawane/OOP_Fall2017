package com.company;


    public class CircleDemo {
        public static void main(String[] args) {
            Circle2 c1 = new Circle2(2.0, 10, 20);
            System.out.println(c1.includePoint(10, 20));
            System.out.println(c1.includePoint(10, 22));
            System.out.println(c1.includePoint(10, 23));
            System.out.println(c1.includePoint(11, 21));
        }
    }

