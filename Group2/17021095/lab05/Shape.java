public class Shape {
    //khoi tao
    public String color = "red";
    public boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //ham get set
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public String toString() {
        return color + " " + filled;
    }

    public static void main(String args[]) {
        Circle c = new Circle(2.0);
        c.getArea();

        Rectangle r = new Rectangle(3.0, 4.0);
        r.getArea();

        Square q = new Square(4.0);
    }
}
