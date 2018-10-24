package com.company;

import java.awt.*;

public class Square extends Retangle {

    //constructor
    public Square() {
    }

    public Square(int side, double rotate) {
        super(side, side, rotate);
    }

    public Square(int x, int y, int side, double rotate, String name) {
        super(x, y,  side, side, rotate, name);
    }

    //getter & setter

    public int getSide() {
        return this.width;
    }

    public void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
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
    public void setWidth(int side) {
        this.setSide(side);
    }

    @Override
    public void setHeight(int side) {
        this.setSide(side);
    }

    @Override
    public void  paint(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setColor(Color.ORANGE);
        graphics2D.rotate(Math.toRadians(rotate), x + width / 2, y + height / 2);
        graphics2D.fillRect(x, y, width, height);
    }


}
