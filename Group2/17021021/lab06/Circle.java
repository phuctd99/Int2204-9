public class Circle extends Shape {
    private double radius;

    //constructor
    public Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, int x, int y, String color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", posi=(" + posiX + "," + posiY + ")" +
                ", color='" + color + '\'' +
                '}';
    }
}
