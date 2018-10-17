public class Circle extends Shape {

    private double radius;
    private final double PI = 3.14;

    public Circle(String address, double size, boolean movable, boolean filled, double radius) {
        super(address, size, movable, filled);
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
