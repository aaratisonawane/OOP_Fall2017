package com.company;

public class Rhombus {
    private double dia1;
    private double dia2;
    private double side;
    static  int count = 0;
    public Rhombus(double side, double dia1, double dia2) {
        this.setSide(side);
        this.setDia1(dia1);
        this.setDia2(dia2);
        count++;
    }
    public double perimeter() {
        return (4*getSide());
    }
    public double area() {
        return((getDia1()*getDia2())/2);
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getDia1() {
        return dia1;
    }
    public void setDia1(double dia1) {
        this.dia1 = dia1;
    }
    public double getDia2() {
        return dia2;
    }
    public void setDia2(double dia2) {
        this.dia2 = dia2;
    }
}
