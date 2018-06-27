package com.company;

public class FigureDemo {
    public static void main(String[] args) {
        Square s1 = new Square(5);
        System.out.println("Square " + Square.count);
        System.out.println("Side = " + s1.getSide());
        System.out.println("Area = " + s1.area());
        System.out.println("Perimeter = " + s1.perimeter());
        System.out.println();

        Rectangle r1 = new Rectangle(7.0,4.0);
        System.out.println("Rectangle  " + Rectangle.count);
        System.out.println("Length = " + r1.getLength());
        System.out.println("Width = " + r1.getWidth());
        System.out.println("Area = " + r1.area());
        System.out.println("Perimeter = " + r1.perimeter());
        System.out.println();

        EqTriangle Eq1 = new EqTriangle(4);
        System.out.println("Equilateral Triangle " +EqTriangle.count);
        System.out.println("Side = " + Eq1.getSide());
        System.out.println("Area = " + Eq1.area());
        System.out.println("Perimeter = " + Eq1.perimeter());
        System.out.println();

        Rhombus rh1 = new Rhombus(5,6,8);
        System.out.println("Rhombus " + Rhombus.count);
        System.out.println("Side " +rh1.getSide());
        System.out.println("Diagonal_1 = " + rh1.getDia1());
        System.out.println("Diagonal_2 = " + rh1.getDia2());
        System.out.println("Area = " + rh1.area());
        System.out.println("Perimeter = " + rh1.perimeter());
    }
}