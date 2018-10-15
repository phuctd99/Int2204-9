package Tuan6;

public class circle extends shape {
    private point center;
    private int radius = 1;
    private final double PI = 3.14;

    public  circle() {}

    public circle(point center, int radius) {
        super();
        this.center = center;
        this.radius = radius;
    }

    public circle(String color, boolean filled, point center, int radius) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public point getCenter() {
        return center;
    }

    public void setCenter(point center) {
        this.center = center;
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
        center.setX(this.center.getX() + x);
        center.setY(this.center.getY() + y);
    }
}

