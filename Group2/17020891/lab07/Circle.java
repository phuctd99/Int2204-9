package com.company;

import java.awt.*;

public class Circle extends Shape {
    private int radius;

    //Constructor
    public Circle() {
        super();
        this.radius = 1;
    }

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    public Circle(int x, int y,  int radius, String name) {
        super(x, y, name);
        this.radius = radius;
    }



    //constructor
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
                {"radius", this.radius},
                {"red", this.color.getRed()},
                {"blue", this.color.getBlue()},
                {"green", this.color.getGreen()}
        };
        return objects;
    }

    //draw method
    @Override
    public void  paint(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setColor(Color.ORANGE);
        graphics2D.fillOval(x, y, radius * 2, radius * 2);
    }


    //override equals method
    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Circle)) {
            return false;
        } else if (obj instanceof Circle) {
            Circle circle = (Circle) obj;
            return (this.x == circle.x) &&
                    (this.y == circle.y) &&
                    (this.radius == circle.radius) &&
                    (this.rotate == circle.rotate) &&
                    (this.color.equals(circle.color));
        }
        return false;

    }

}
