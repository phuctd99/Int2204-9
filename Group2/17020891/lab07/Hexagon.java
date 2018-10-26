package com.company;

import java.awt.*;

public class Hexagon extends Shape{
    private int radius;

    //constructor


    public Hexagon(int x, int y, int radius, double rotate, String name) {
        super(x, y, name);
        this.rotate = rotate;
        this.radius = radius;
    }

    //getter and setter
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    //get properties table

    @Override
    public Object[][] getPropertyTable() {
        Object[][] objects = {
                {"x", this.x},
                {"y", this.y},
                {"radius", radius},
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
        if (! (obj instanceof Hexagon)) {
            return false;
        } else if (obj instanceof Hexagon) {
            Hexagon hexagon = (Hexagon) obj;
            return (this.x == hexagon.x) &&
                    (this.y == hexagon.y) &&
                    (this.radius == hexagon.radius) &&
                    (this.rotate == hexagon.rotate) &&
                    (this.color.equals(hexagon.color));
        }
        return false;

    }

    @Override
    public void  paint(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setColor(Color.ORANGE);
        Polygon polygon = new Polygon();
        for (int i = 0; i < 6; i++) {
            polygon.addPoint((int) (x + radius * Math.cos(i * 2 * Math.PI / 6)),
                    (int) (y + radius * Math.sin(i * 2 * Math.PI / 6)));
        }
        graphics2D.rotate(Math.toRadians(rotate), x, y);
        graphics2D.fillPolygon(polygon);
    }

}
