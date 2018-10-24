import java.awt.*;

public class Triangle extends Shape {
    private Point p1;
    private Point p2;
    private Point p3;
    @Override
    public void draw(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.drawPolygon(new int[] {p1.x, p2.x, p3.x}, new int[] {p1.y, p2.y, p3.y}, 3);
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    //    private float sign() {
//        Point vector1, vector2;
//
//
//        vector1.x = p1.x - p3.x;
//        vector1.y = p1.y - p3.y;
//        vector2.x = p2.x - p3.x;
//        vector2.y = p2.y - p3.y;
//
//
//        return vector1.x * vector2.y - vector2.x * vector1.y;
//    }
//    private bool pointInTriangle(Point2D p1, Point2D p2, Point2D p3, Point2D p)
//    {
//        if (((sign(p, p1, p2) < 0) && (sign(p, p1, p3) < 0) && (sign(p, p2, p3) < 0)) || ((sign(p, p1, p2) > 0) && (sign(p, p1, p3) > 0) && (sign(p, p2, p3) > 0)))
//        {
//            return true;
//        }
//        return false;
//    }
    @Override
    public boolean contains(Point point) {

        return false;


    }

    @Override
    public void move(Point start, Point end) {

    }

    @Override
    public void makeObject(Point start, Point end) {

    }
}
