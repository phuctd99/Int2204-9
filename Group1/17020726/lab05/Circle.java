public class Circle extends Shape
{
    private final double PI = 3.14;
    private double radius = 1.0;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    double getArea()
    {
        return PI * radius * radius;
    }

    double getPerimeter()
    {
        return 2 * PI * radius;
    }

    @Override
    public String toString()
    {
        return "Circle{" + "radius=" + radius + '}';
    }
}
