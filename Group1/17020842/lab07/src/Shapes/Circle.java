/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import location.Location2D;

/**
 *
 * @author CACLV
 */
public class Circle extends Shape {

    protected int radius;
    protected Location2D centerD;

    @Override
    public boolean isSame(Shape shape) {
        if (this instanceof Circle && shape instanceof Circle) {
            return this.centerD.isSame(((Circle) shape).centerD) && this.radius == ((Circle) shape).radius;
        }
        return false;
    }

    public Circle(int radius, Location2D centerD, Color color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.centerD = centerD;
    }

    @Override
    public void draw(Graphics g) {
        paint(g);
    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(this.getColor());
        if (this.filled) {
            g2d.fillOval(this.centerD.getX(), this.centerD.getY(), 2 * this.radius, 2 * this.radius);
        } else {
            g2d.drawOval(this.centerD.getX(), this.centerD.getY(), 2 * this.radius, 2 * this.radius);
        }
    }

    @Override
    public boolean contain(int x, int y) {
        Location2D pointCurrentD = new Location2D(x, y);
        return pointCurrentD.distance(centerD) < (double) radius;
    }

    public Location2D getCenterD() {
        return centerD;
    }

    public void setCenterD(Location2D centerD) {
        this.centerD = centerD;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    /*@Override
    public void move(int x, int y, int dx, int dy) {
        if (contain(x, y)) {
            getCenterD().setX(dx + getCenterD().getX());
            getCenterD().setY(dy + getCenterD().getY());
            
            if (getCenterD().getX() < 0) {
                getCenterD().setX(0);
            } else if (getCenterD().getX() > 600 - 2 * getRadius()) {
                getCenterD().setX(600 - 2 * getRadius());
            }

            if (getCenterD().getY() < 0) {
                getCenterD().setY(0);
            } else if (getCenterD().getY() > 600 - 2 * getRadius()) {
                getCenterD().setY(600 - 2 * getRadius());
            }
            //repaint();
        }
    }*/
}
