package com.company;

public class Retangle extends Shape{
    private double width;
    private double length;

    //Constructor
    public Retangle() {
        super();
        this.length = 1.0;
        this.width = 1.0;
    }

    public Retangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Retangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    //getter & setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //Area and Perimeter
    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    //toString
    @Override
    public String toString() {
        return "Retangle{" +
                "color = '" + getColor() + '\'' +
                ", filled = " + isFilled() +
                ", width = " + width  +
                ", length = " + length +
                "} ";
    }
}
