package com.company;

import java.awt.*;

public class Triangle extends  Shape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Triangle(int x, int y, int x1, int y1, int x2, int y2, String name) {
        super(x, y, name);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    //getter and setter
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

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }


    //get properties table
    @Override
    public Object[][] getPropertyTable() {
        Object[][] objects = {
                {"x0", this.x},
                {"y0", this.y},
                {"x1", x1},
                {"y1", y1},
                {"x2", x2},
                {"y2", y2},
                {"rotate", rotate},
                {"red", this.color.getRed()},
                {"blue", this.color.getBlue()},
                {"green", this.color.getGreen()}
        };
        return objects;
    }

    //override equals method
    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Triangle)) {
            return false;
        } else if (obj instanceof Triangle) {
            Triangle triangle = (Triangle) obj;
            return (this.x == triangle.x) &&
                    (this.y == triangle.y) &&
                    (this.x1 == triangle.x1) &&
                    (this.y1 == triangle.y1) &&
                    (this.x2 == triangle.x2) &&
                    (this.y2 == triangle.y2) &&
                    (this.rotate == triangle.rotate) &&
                    (this.color.equals(triangle.color));
        }
        return false;

    }

    //draw method
    @Override
    public void  paint(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setColor(Color.ORANGE);
        Polygon triangle = new Polygon();
        triangle.addPoint(x, y);
        triangle.addPoint(x1, y1);
        triangle.addPoint(x2, y2);
        graphics2D.rotate(Math.toRadians(rotate), x, y);
        graphics2D.fillPolygon(triangle);
    }
}
