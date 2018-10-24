package DrawGraphics;

import java.awt.*;

public class Rectangle extends Shape {
    private int x1, y1, width, height;

    public Rectangle() {};

    public Rectangle(Color color, boolean filled, String name, int x1, int y1, int width, int height) {
        super(color, filled, name);
        this.x1 = x1;
        this.y1 = y1;
        this.width = width;
        this.height = height;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return height;
    }

    public void setLength(int length) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
//        g2d.setPaint(new Color(150, 30, 15));

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);

        g2d.fillRect(x1, y1, width, height);
        setForeground(getColor());
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}