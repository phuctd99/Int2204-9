public class Circle extends Shape {
    double radius = 1.0;
//    double area;
//    double perimeter;
    public final double PI = 3.14;

    Circle(){}
    Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getAres()
    {
        return 2*PI*this.radius;
    }

    public double getPerimeter() {
        return PI*this.radius*this.radius;
    }
    public String toString()
    {
        return "Color: " + this.color + " FILLED:" + this.filled+" Ban kinh hinh tron:" + this.radius + " Dien tich hinh tron:" + this.getAres() + " Chu vi hinh tron:" + this.getPerimeter();
    }
}
