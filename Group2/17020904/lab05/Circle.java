package Lab052;
public class Circle extends Shape {
    public double radius = 1.0;
    public double PI = 3.14;
    //Khoi tao
    public Circle(){
        super();
    }
    public Circle(double radius)
    {
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, Boolean filled) {
        super(color,filled);
        this.radius = radius;
    }
    //

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Tinh Dien Tich
    public double getArea()
    {
        return radius*radius*PI;
    }

    //Tinh Chu Vi
    public double getPerimeter()
    {
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
