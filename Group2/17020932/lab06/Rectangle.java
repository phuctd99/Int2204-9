public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(int x, int y, boolean isColor, boolean move, double width, double length) {
        super(x, y, isColor, move);
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

    public double getArea () {
        return width*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", x=" + x +
                ", y=" + y +
                ", isColor=" + isColor +
                ", move=" + move +
                '}';
    }
}
