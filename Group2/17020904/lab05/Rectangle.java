package Lab052;
public class Rectangle extends Shape {
    public double width = 1.0;
    public double length = 1.0;

    //Khoi tao
    public Rectangle() {
        super();
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color,filled);
        this.length = length;
        this.width = width;
    }
    //
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //Tinh Dien Tich
    public double getArea() {
        return width * length;
    }

    //Tinh Chu vi
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
