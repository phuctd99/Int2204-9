package Shape;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        this.color = color;
        this.filled = filled;
        this.width = side;
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side) {
        this.setSide(side);
    }

    public void setLength(double side) {
        this.setSide(side);

    }

    public String toString () {
        String s;
        s = this.color + ", " + Boolean.toString(this.filled) + ", " + Double.toString(this.width);
        return s;
    }
}
