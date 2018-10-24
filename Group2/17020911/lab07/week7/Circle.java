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
public class Circle extends Shape //class circle
{
    public Point centerpoint;
    public int radius;
    final double pi=3.14;

    public Circle() {
        radius = 1;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(Point centerpoint, int radius, String color, boolean filled, boolean visible) {
        super(color, filled, visible);
        this.centerpoint = centerpoint;
        this.radius = radius;
    }

    

    public double getRadius() {
        return radius;
    }

    public void setRadius(int a) {
        radius = a;
    }

    

    public Point getCenterpoint() {
        return centerpoint;
    }

    public void setCenterpoint(Point centerpoint) {
        this.centerpoint = centerpoint;
    }
    public void draw(Graphics g)
    {
        g.fillOval(centerpoint.x, centerpoint.y, radius*2, radius*2);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", pi=" + pi + '}';
    }

}