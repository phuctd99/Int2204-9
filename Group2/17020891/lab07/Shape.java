package com.company;

import javax.swing.*;
import java.awt.*;

abstract class Shape extends JPanel {
    protected int x;
    protected int y;
    protected double rotate;
    protected String name;
    protected Color color;

    //constructor
    public Shape(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.color = Color.ORANGE;
    }

    public Shape() {
        this.x = 0;
        this.y = 0;
    }

    //method
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //getter & setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(int r, int b, int g) {
        color = new Color(r, b, g);
    }

    public void setRotate(double rotate) {
        this.rotate = rotate;
    }

    @Override
    public String getName() {
        return name;
    }

    public abstract Object[][] getPropertyTable();

    public abstract  void paint(Graphics graphics);
    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
