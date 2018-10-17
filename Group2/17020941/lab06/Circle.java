package oop_tuan6;

public class Circle extends Shape {
    public final double PI = 3.14;
    private double radius;


    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double x, double y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                ", radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                "} ";
    }
}