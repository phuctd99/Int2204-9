package com.company;

public class Retangle extends Shape {

    protected double width;
    protected double length;

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

    public Retangle(int x, int y, String color, double width, double length) {
        super(x, y, color);
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

    @Override
    public String toString() {
        return "Retangle{" +
                "width=" + width +
                ", length=" + length +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
