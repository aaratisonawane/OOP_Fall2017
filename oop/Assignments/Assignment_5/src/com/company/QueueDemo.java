package com.company;

public class QueueDemo {
    public static void main(String[] args) {
        CircularQueueInt q1 = new CircularQueueInt(10);
        q1.put(1);
        q1.put(2);
        System.out.println(q1.get());
        System.out.println(q1.get());
        System.out.println(q1.get());
        System.out.println(q1.get());
        q1.put(3);
        q1.put(4);
        q1.put(5);
        q1.put(6);
        q1.put(7);
        q1.put(8);
        q1.put(9);
        System.out.println(q1.get());
        System.out.println(q1.get());
        System.out.println(q1.get());
        System.out.println(q1.get());
        System.out.println(q1.get());
        System.out.println(q1.get());
        System.out.println(q1.get());
        q1.put(10);
        q1.put(11);
        q1.put(12);
        q1.put(13);
        q1.put(14);
        q1.put(15);
        q1.put(16);
        q1.put(17);
        q1.put(18);
        q1.put(19);
        q1.put(20);
        q1.put(21);
    }
}