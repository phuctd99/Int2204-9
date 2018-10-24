import java.awt.*;

public class Circle extends Shape {
    private Point point;
    private int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.drawOval(point.x, point.y, radius, radius);
    }

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
