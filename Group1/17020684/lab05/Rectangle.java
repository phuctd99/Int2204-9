
package lab5_1;

public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;
    //Constructor
    public Rectangle() {
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    //Setter and getter
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
    //dien tich
    public double getArea(){
        return this.length*this.width;
    }
    //chu vi
    public double getPerimeter(){
        return (this.length+this.width)*2;
    }
    //toString
    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
    
}
