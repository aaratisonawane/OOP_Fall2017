package com.company;

public class Circle2 {
    private double radius;
    private double x;
    private double y;
    static double PI = 3.14;

    public Circle2(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double perimeter() {
        return (2 * PI * radius);
    }

    public double area() {
        return (PI * radius * radius);
    }

    public boolean includePoint(double x1, double y1) {
        double distance = Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
        if (distance < radius) {
            return true;
        } else
            return false;
    }


}
