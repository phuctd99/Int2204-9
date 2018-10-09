public class Rectangle extends Shape {
    public double width = 1.0;
    public double length = 1.0;

    //cac phuong thuc khoi tao
    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    //ham get set
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //tinh dien tich
    public double getArea() {
        return width * length;
    }

    //tinh chu vi
    public double getPerimeter() {
        return (width + length) * 2;
    }


    public String toString() {
        return super.toString() + " " + width + " " + length;
    }
}
