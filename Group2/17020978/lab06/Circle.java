public class Circle extends Shape {
    double radius = 1.0;

    public final double PI = 3.14;

    double toado1= 1.0;
    double toado2= 1.0;

    Circle(){}
    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double toado1, double toado2)
    {

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

    public double getPerimeter()
    {
        return PI*this.radius*this.radius;
    }
    public String toString()
    {
        return "Color: " + this.color + " FILLED:" + this.filled +" Ban kinh hinh tron:" + this.radius + " Dien tich hinh tron:" + this.getAres() + " Chu vi hinh tron:" + this.getPerimeter();
    }

    public double getToado1() {
        return toado1;
    }

    public void setToado1(double toado1) {
        this.toado1 = toado1;
    }

    public double getToado2() {
        return toado2;
    }

    public void setToado2(double toado2) {
        this.toado2 = toado2;
    }
}
