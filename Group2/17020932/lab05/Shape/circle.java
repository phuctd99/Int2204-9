package Shape;

public class circle extends shape{
    private double radius;
    final double Pi = 3.14;

    public circle () {
        super();
        radius = 1.0;
    }

    public circle (double radius) {
        super();
        this.radius = radius;
    }

    public circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Pi*radius*radius;
    }

    public double getPerimeter() {
        return Pi*(radius + radius);
    }

    public String toString() {
        String s;
        s = super.toString() + ", " + Double.toString(radius);
        return s;
    }
}
