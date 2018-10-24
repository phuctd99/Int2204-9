package Lab06;
public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(int _x, int _y, boolean movable, boolean filled, double length, double width) {
        super(_x, _y, movable, filled);
        this.width = width;
        this.length = length;
    }

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
}
