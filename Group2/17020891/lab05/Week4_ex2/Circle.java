package com.company;

public class Circle extends Shape {
    public final double PI = 3.14;
    private double radius;

    //Constructor
    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    //get & set
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * PI;
    }

    public double getPerimeter() {
        return 2 * this.radius * PI;
    }

    //toString
    @Override
    public String toString() {
        return "Circle{" +
                "color = '" + this.getRadius() + '\'' +
                ", filled = " + isFilled() + '\'' +
                ", radius = " + radius +
                '}';
    }
}
