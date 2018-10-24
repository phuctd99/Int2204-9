/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.awt.Graphics;

/**
 *
 * @author Admin
 */
public class Triangle extends Shape{
    private Point x1;
    private Point x2;
    private Point x3;

    public Point getX1() {
        return x1;
    }

    public void setX1(Point x1) {
        this.x1 = x1;
    }

    public Point getX2() {
        return x2;
    }

    public void setX2(Point x2) {
        this.x2 = x2;
    }

    public Point getX3() {
        return x3;
    }

    public void setX3(Point x3) {
        this.x3 = x3;
    }
    
    public Triangle(Point x1, Point x2, Point x3, String color, boolean filled, boolean visible) {
        super(color, filled, visible);
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }
    public void draw(Graphics g)
    {
        g.drawLine(x1.x,x1.y,x2.x,x2.y);
        g.drawLine(x1.x,x1.y,x3.x,x3.y);
        g.drawLine(x2.x,x2.y,x3.x,x3.y);
        int xpoint[]={x1.x,x2.x,x3.x};
        int ypoint[]={x1.y,x2.y,x3.y};
        g.fillPolygon(xpoint, ypoint, 3);
        
    }

    @Override
    public String toString() {
        return "Triangle{" + "side1=" + x1 + ", side2=" + x2 + ", side3=" + x3 + '}';
    }
    
}