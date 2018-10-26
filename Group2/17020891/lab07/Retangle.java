package com.company;

import java.awt.*;

public class Retangle extends Shape {
    protected int width;
    protected int height;

    //Constructor
    public Retangle() {
        super();
        this.height = 1;
        this.width = 1;
        this.rotate = 0;
    }

    public Retangle(int width, int height, double rotate) {
        super();
        this.width = width;
        this.height = height;
        this.rotate = rotate;
    }

    public Retangle(int x, int y, int width, int height, double rotate, String name) {
        super(x, y, name);
        this.width = width;
        this.height = height;
        this.rotate = rotate;
    }

    //getter & setter
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    //get properties table
    @Override
    public Object[][] getPropertyTable() {
         Object[][] objects = {
                 {"x", this.x},
                 {"y", this.y},
                 {"width", width},
                 {"height", height},
                 {"rotate", rotate},
                 {"red", this.color.getRed()},
                 {"blue", this.color.getBlue()},
                 {"green", this.color.getGreen()}
         };
         return objects;
    }

    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Retangle)) {
            return false;
        } else if (obj instanceof Retangle) {
            Retangle retangle = (Retangle) obj;
            return (this.x == retangle.x) &&
                    (this.y == retangle.y) &&
                    (this.width == retangle.width) &&
                    (this.height == retangle.height) &&
                    (this.rotate == retangle.rotate) &&
                    (this.color.equals(retangle.color));
        }
        return false;

    }
    //
    @Override
    public void  paint(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setColor(Color.ORANGE);
        graphics2D.rotate(Math.toRadians(rotate), x + width / 2, y + height / 2);
        graphics2D.fillRect(x, y, width, height);
    }
}
