public class Square extends Shape {
    private double width;
    private double length;

    public Square() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Square(int x, int y, boolean isColor, boolean move, double side) {
        super(x, y, isColor, move);
        this.width = side;
        this.length = side;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    public double getArea() {
        return width*length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", x=" + x +
                ", y=" + y +
                ", isColor=" + isColor +
                ", move=" + move +
                '}';
    }
}
