package Lab06;
public class Circle extends Shape {

    private double radius;
    private final double PI = 3.14;

    public Circle(int _x, int _y, boolean movable, boolean filled, double radius) {
        super(_x, _y, movable, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }
}
