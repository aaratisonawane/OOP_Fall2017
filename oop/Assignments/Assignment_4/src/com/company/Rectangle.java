package com.company;

public class Rectangle {
    private double length;
    private double width;
    static int count = 0;

    public Rectangle(double length, double width) {
        this.setLength(length);
        this.setWidth(width);
        count++;
    }

    public double perimeter() {
        return (2 * (getLength() + getWidth()));
    }

    public double area() {
        return (getLength() * getWidth());
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}


