/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author DELL
 */
public class Hexagon extends Shape {

    Point p1, p2, p3, p4, p5, p6;

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public Point getP4() {
        return p4;
    }

    public Point getP5() {
        return p5;
    }

    public Point getP6() {
        return p6;
    }

    public void draw(Graphics g)
    {
        int[] xPoints = {p1.x, p2.x, p3.x, p4.x, p5.x, p6.x};
        int[] yPoints = {p1.y, p2.y, p3.y, p4.y, p5.y, p6.y};
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
        g.drawLine(p2.x, p2.y, p3.x, p3.y);
        g.drawLine(p3.x, p3.y, p4.x, p4.y);
        g.drawLine(p4.x, p4.y, p5.x, p5.y);
        g.drawLine(p5.x, p5.y, p6.x, p6.y);
        g.drawLine(p6.x, p6.y, p1.x, p1.y);
        g.fillPolygon(xPoints, yPoints, 6);
    }
    
}