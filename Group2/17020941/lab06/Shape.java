package oop_tuan6;

abstract public class Shape {
    protected double x;
    protected double y;
    protected String color;

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape() {
        this.x = 0;
        this.y = 0;
        this.color = "black";
    }

    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void fillColor(String color) {
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}