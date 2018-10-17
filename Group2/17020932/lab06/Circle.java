public class Circle extends Shape {
    private double r;
    private final double Pi = 3.14;

    public Circle() {
        super();
        this.r = 1.0;
    }

    public Circle(int x, int y, boolean isColor, boolean move, double r) {
        super(x, y, isColor, move);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea () {
        return Pi*r*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", x=" + x +
                ", y=" + y +
                ", isColor=" + isColor +
                ", move=" + move +
                '}';
    }
}
