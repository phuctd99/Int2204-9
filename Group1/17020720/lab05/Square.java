package DoThi;

public class Square extends Rectangle{//ke thua lop Rectangle
    private double side, area, perimeter;

    Square(){
        this.side = 1.0;
        this.area = 0;
        this.perimeter = 0;
    }
    public Square(double side, double area, double perimeter) {
        this.side = side;
        this.area = area;
        this.perimeter = perimeter;
    }

    public Square(String color, boolean filled, double width, double length, double side) {
        super(color, filled, width, length);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color = " + getColor() +
                ", filled = " + isFilled() +
                ", width = " + getWidth()+
                ", length = " + getLength() +
                ", side=" + side +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
