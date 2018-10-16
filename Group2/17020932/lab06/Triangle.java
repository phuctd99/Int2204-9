import java.math.*;
public class Triangle extends Shape {
    private double a, b, c;

    public Triangle() {
        super();
        this.a = 1.0;
        this.b = 1.0;
        this.c = 1.0;
    }

    public Triangle(int x, int y, boolean isColor, boolean move, double a, double b, double c) {
        super(x, y, isColor, move);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getArea () {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", x=" + x +
                ", y=" + y +
                ", isColor=" + isColor +
                ", move=" + move +
                '}';
    }
}
