package com.company;

public class EqTriangle {
    private double side;
    static int count = 0;

    public EqTriangle(double side) {
        this.setSide(side);
        count++;
    }
    public double perimeter() {
        return (3 * getSide());
    }

    public double area() {
        return ((Math.sqrt(3) / 4) * getSide() * getSide());
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
