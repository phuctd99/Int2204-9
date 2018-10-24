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
public class Rectangle extends Shape {

    protected Location2D firstD;
    protected int length, width;

    public Rectangle(Location2D firstD, int length, int width, Color color, boolean filled) {
        super(color, filled);
        this.firstD = firstD;
        this.length = length;
        this.width = width;
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
            g2d.fillRect(this.firstD.getX(), this.firstD.getY(), this.getLength(), this.getWidth());
        } else {
            g2d.drawRect(this.firstD.getX(), this.firstD.getY(), this.getLength(), this.getWidth());
        }

    }

    /*@Override
    public void move(int x, int y, int dx, int dy) {
        if (this.contain(x, y)) {
            this.getFirstD().setX(dx + this.getFirstD().getX());
            this.getFirstD().setY(dy + this.getFirstD().getY());
            //repaint();
            if (this.getFirstD().getX() < 0) {
                this.getFirstD().setX(0);
            } else if (this.getFirstD().getX() > 550) {
                this.getFirstD().setX(550);
            }

            if (this.getFirstD().getY() < 0) {
                this.getFirstD().setY(0);
            } else if (this.getFirstD().getY() > 550) {
                this.getFirstD().setY(550);
            }
            
        }
    }*/

    @Override
    public boolean contain(int x, int y) {
        return x <= (firstD.getX() + length) && x >= firstD.getX()
                && y <= (firstD.getY() + width) && y >= firstD.getY();
    }

    @Override
    public boolean isSame(Shape shape) {
        if (this instanceof Rectangle && shape instanceof Rectangle) {
            return this.firstD.isSame(((Rectangle) shape).firstD) && this.getLength() == ((Rectangle) shape).getLength()
                    && this.getWidth() == ((Rectangle) shape).getWidth();
        }
        return false;
    }

    public Location2D getFirstD() {
        return firstD;
    }

    public void setFirstD(Location2D firstD) {
        this.firstD = firstD;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    /*
    public Rectangle(Location2D firstD, Location2D secondD, Location2D centerD, Color color, boolean filled) {
        super(color, filled);
        this.firstD = firstD;
        this.secondD = secondD;
        this.centerD = centerD;
    }

    public Location2D getSecondD() {
        return secondD;
    }

    public void setSecondD(Location2D secondD) {
        this.secondD = secondD;
    }

    public Location2D getCenterD() {
        return centerD;
    }

    public void setCenterD(Location2D centerD) {
        this.centerD = centerD;
    }
    
    public Location2D getThirthD() {
        return new Location2D(2 * centerD.getX() - firstD.getX(), 2 * centerD.getY() - firstD.getY());
    }

    public Location2D getFourthD() {
        return new Location2D(2 * centerD.getX() - secondD.getX(), 2 * centerD.getY() - secondD.getY());
    }

    public double getLength() {
        return firstD.distance(secondD);
    }

    public double getWidth() {
        return 2 * Math.sqrt(Math.pow(centerD.distance(secondD), 2) - Math.pow(this.getLength() / 2, 2));
    }
     */
}
