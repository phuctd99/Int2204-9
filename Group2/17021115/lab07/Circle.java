package Week7;

import java.awt.Graphics;
public class Circle extends Shape {
    private Point toaDoTam;
    private int radius;
    private final double PI = 3.14;

    public  Circle() {}

    public Circle(Point toaDoTam, int radius) {
        super();
        this.toaDoTam = toaDoTam;
        this.radius = radius;
    }

    public Circle(String color, boolean filled, Point toaDoTam, int radius) {
        super(color, filled);
        this.toaDoTam = toaDoTam;
        this.radius = radius;
    }

    public Point getsetToaDoTam() {
        return toaDoTam;
    }

    public void setToaDoTam(Point toaDoTam) {
        this.toaDoTam = toaDoTam;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public void move(int x, int y) {
        toaDoTam.setX(this.toaDoTam.getX() + x);
        toaDoTam.setY(this.toaDoTam.getY() + y);
    }
}