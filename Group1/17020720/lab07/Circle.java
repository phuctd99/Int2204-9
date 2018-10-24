package DrawGraphics;

import java.awt.*;

public class Circle extends Shape {
    protected int  radius, x1, y1;

    public Circle(int radius, int x1, int y1){
        this.radius = 0;
        this.x1 = 0;
        this.y1 = 0;
    }

    public Circle(Color color, boolean filled, String name, int x1, int y1, int radius){
        super(color, filled, name);
        this.radius = radius;
        this.x1 = x1;
        this.y1 = y1;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX1() {
        return x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY1() {
        return y1;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x1=" + x1 +
                ", y1=" + y1 +
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

        g2d.fillOval(x1, y1, 2*radius, 2*radius);
        setForeground(getColor());
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}