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
public class Triangle extends Shape {

    protected Location2D firstD;
    protected Location2D secondD;
    protected Location2D thirdD;

    public Triangle(Location2D firstD, Location2D secondD, Location2D thirdD, Color color, boolean filled) {
        super(color, filled);
        this.firstD = firstD;
        this.secondD = secondD;
        this.thirdD = thirdD;
    }

//    public Triangle(Color color, boolean filled) {
//        super(color, filled);
//    }
    @Override
    public void draw(Graphics g) {
        paint(g);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(this.getColor());
        int[] locationX = {this.firstD.getX(), this.secondD.getX(), this.thirdD.getX()};
        int[] locationY = {this.firstD.getY(), this.secondD.getY(), this.thirdD.getY()};
        if (this.filled) {
            g2d.fillPolygon(locationX, locationY, 3);
        } else {
            g2d.drawPolygon(locationY, locationY, 3);
        }

    }

    float sign(Location2D p1, Location2D p2, Location2D p3) {
        return (p1.getX() - p3.getX()) * (p2.getY() - p3.getY()) - (p2.getX() - p3.getX()) * (p1.getY() - p3.getY());
    }

    @Override
    public boolean contain(int x, int y) {
        Location2D pointCurrentD = new Location2D(x, y);
        boolean b1, b2, b3;
        b1 = sign(pointCurrentD, firstD, secondD) < 0.0f;
        b2 = sign(pointCurrentD, secondD, thirdD) < 0.0f;
        b3 = sign(pointCurrentD, thirdD, firstD) < 0.0f;
        return (b1 == b2 && b2 == b3);
    }

    public void erase() {
        System.out.println("Erase Triangle");
    }

    @Override

    public boolean isSame(Shape shape) {
        if (this instanceof Triangle && shape instanceof Triangle) {
            Triangle t = (Triangle) shape;
            return this.firstD.isSame(t.firstD) && this.secondD.isSame(t.secondD) && this.thirdD.isSame(t.thirdD);
        }
        return false;
    }

    public Location2D getFirstD() {
        return firstD;
    }

    public void setFirstD(Location2D firstD) {
        this.firstD = firstD;
    }

    public Location2D getSecondD() {
        return secondD;
    }

    public void setSecondD(Location2D secondD) {
        this.secondD = secondD;
    }

    public Location2D getThirdD() {
        return thirdD;
    }

    public void setThirdD(Location2D thirdD) {
        this.thirdD = thirdD;
    }

   /* @Override
    public void move(int x, int y, int dx, int dy) {
        if (contain(x, y)) {
            getFirstD().setX(dx + getFirstD().getX());
            getFirstD().setY(dy + getFirstD().getY());
            repaint();
            getSecondD().setX(dx + getSecondD().getX());
            getSecondD().setY(dy + getSecondD().getY());
            repaint();
            getThirdD().setX(dx + getThirdD().getX());
            getThirdD().setY(dy + getThirdD().getY());
            //repaint();
            if (getFirstD().getX() < 0) {
                getFirstD().setX(0);
            } else if (getFirstD().getX() > 600) {
                getFirstD().setX(600);
            }

            if (getFirstD().getY() < 0) {
                getFirstD().setY(0);
            } else if (getFirstD().getY() > 600) {
                getFirstD().setY(600);
            }

            if (getSecondD().getX() < 0) {
                getSecondD().setX(0);
            } else if (getSecondD().getX() > 600) {
                getSecondD().setX(600);
            }

            if (getSecondD().getY() < 0) {
                getSecondD().setY(0);
            } else if (getSecondD().getY() > 600) {
                getSecondD().setY(600);
            }

            if (getThirdD().getX() < 0) {
                getThirdD().setX(0);
            } else if (getThirdD().getX() > 600) {
                getThirdD().setX(600);
            }

            if (getThirdD().getY() < 0) {
                getThirdD().setY(0);
            } else if (getThirdD().getY() > 600) {
                getThirdD().setY(600);
            }
            //repaint();
        }

    }
    */
}



