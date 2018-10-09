package DoThi;

public class Rectangle extends Shape{//ke thua lop Shape
    private double width, length, area, perimeter;

    Rectangle(){
        this.length = 1.0;
        this.width = 1.0;
        this.area = 0;
        this.perimeter = 0;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
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

    //tra ve gia tri cua dien tich
    public double getArea() {
        return width*length;
    }

    //tra ve gia tri chu vi
    public double getPerimeter() {
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color = " + getColor() +
                ", filled = " + isFilled() +
                ", width=" + width +
                ", length=" + length +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
