public class Circle extends Shape {
    public double radius = 1.0;
    public double PI = 3.14;

    //phuong thuc khoi tao
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, Boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    //ham get set
    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //tinh dien tich
    public double getArea() {
        return radius * radius * PI;
    }

    //tinh chu vi
    public double getPerimeter() {
        return 2 * PI * radius;
    }


    public String toString() {
        return super.toString() + " " + radius + " " + PI;
    }
}
