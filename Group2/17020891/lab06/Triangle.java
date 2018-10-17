package com.company;

public class Triangle extends Shape {
    private double base;
    private double height;

    //constructor

    public Triangle() {
        super();
        this.base = 1.0;
        this.height = 1.0;
    }

    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    public Triangle(double x, double y, String color, double base, double height) {
        super(x, y, color);
        this.base = base;
        this.height = height;
    }

    //getter & setter
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.base * this.height * 0.5;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
