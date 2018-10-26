package lab7;

public class Hexagon extends Shape {
    protected Point p1;
    protected Point p2;
    protected Point p3;
    protected Point p4;
    protected Point p5;
    protected Point p6;

    public Hexagon(Point p1, Point p2, Point p3, Point p4, Point p5, Point p6) {
        super();
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
    }

    public Hexagon(String color, boolean isFilled, Point point1, Point point2, Point point3, Point point4, Point point5,
                   Point point6) {
        super(color, isFilled);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP1() {
        return p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP2() {
        return p2;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP3() {
        return p3;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }

    public Point getP4() {
        return p4;
    }

    public void setP5(Point p5) {
        this.p5 = p5;
    }

    public Point getP5() {
        return p5;
    }

    public void setP6(Point p6) {
        this.p6 = p6;
    }

    public Point getP6() {
        return p6;
    }


}
