package oop_tuan6;

public class Rectangle extends Shape {

    protected double width;
    protected double length;


    public Rectangle() {
        super();
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(int x, int y, String color, double width, double length) {
        super(x, y, color);
        this.width = width;
        this.length = length;
    }


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