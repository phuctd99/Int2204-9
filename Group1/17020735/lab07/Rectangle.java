import javax.swing.*;
import java.awt.*;

public class Rectangle extends Shape{
    private Point point;
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }

    public Rectangle(Point point, int width, int height) {
        this.point = point;
        this.width = width;
        this.height = height;
    }

    public Point getPoint() {
        return point;
    }

    @Override
    public void draw(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        if (color == null)
            graphics2D.drawRect(point.x, point.y, width, height);
        else {
            graphics2D.setColor(color);
            graphics2D.fillRect(point.x, point.y, width, height);
        }


    }

    @Override
    public void move(Point start, Point end) {
        this.point = new Point(this.point.x + (end.x - start.x),this.point.y + (end.y - start.y));
    }

    @Override
    public boolean contains(Point point) {
        if (point.x >= this.point.x && point.y <= this.point.x + width
            && point.y >= this.point.y && point.y <= this.point.x + height)
            return true;
        return false;
    }

    @Override
    public void makeObject(Point start, Point end) {

    }
}
