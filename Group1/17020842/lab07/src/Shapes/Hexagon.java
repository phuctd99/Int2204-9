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
public class Hexagon extends Shape {

    protected Location2D centerD;
    protected int side;
    
    public Hexagon(Location2D centerD, int side, Color color, boolean filled) {
        super(color, filled);
        this.centerD = centerD;
        this.side = side;
    }

    @Override
    public boolean isSame(Shape shape) {
        if (this instanceof Hexagon && shape instanceof Hexagon) {
            Hexagon h = (Hexagon) shape;
            return this.centerD.isSame(h.centerD) && this.getSide() == h.getSide();
        }
        return false;
    }

    @Override
    public void draw(Graphics g) {
        paint(g);
    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(this.getColor());

        int[] locationX = {this.getFirstD().getX(), this.getSecondD().getX(), this.getThirdD().getX(),
            this.getFourthD().getX(), this.getFifthD().getX(), this.getSixthD().getX()};

        int[] locationY = {this.getFirstD().getY(), this.getSecondD().getY(), this.getThirdD().getY(),
            this.getFourthD().getY(), this.getFifthD().getY(), this.getSixthD().getY()};
        if (this.filled) {
            g2d.fillPolygon(locationX, locationY, 6);
        } else {
            g2d.drawPolygon(locationY, locationY, 6);
        }
    }

    @Override
    public boolean contain(int x, int y) {
        Triangle tri1 = new Triangle(getSecondD(), getFirstD(), getSixthD(), Color.BLACK, true);
        Triangle tri2 = new Triangle(getSecondD(), getFifthD(), getSixthD(), Color.BLACK, true);
        Triangle tri3 = new Triangle(getSecondD(), getFifthD(), getThirdD(), Color.BLACK, true);
        Triangle tri4 = new Triangle(getFifthD(), getThirdD(), getFourthD(), Color.BLACK, true);
        return tri1.contain(x, y) || tri2.contain(x, y) || tri3.contain(x, y) || tri4.contain(x, y);

    }

    public Location2D getCenterD() {
        return centerD;
    }

    public void setCenterD(Location2D centerD) {
        this.centerD = centerD;
    }

    public Location2D getFirstD() {
        return new Location2D(centerD.getX(), centerD.getY() - side);
    }

    public Location2D getSecondD() {
        return new Location2D((int) (centerD.getX() - Math.sin(Math.PI / 3) * side), centerD.getY() - side / 2);
    }

    public Location2D getThirdD() {
        return new Location2D((int) (centerD.getX() - Math.sin(Math.PI / 3) * side), centerD.getY() + side / 2);
    }

    public Location2D getFourthD() {
        return new Location2D(centerD.getX(), centerD.getY() + side);
    }

    public Location2D getFifthD() {
        return new Location2D((int) (centerD.getX() + Math.sin(Math.PI / 3) * side), centerD.getY() + side / 2);
    }

    public Location2D getSixthD() {
        return new Location2D((int) (centerD.getX() + Math.sin(Math.PI / 3) * side), centerD.getY() - side / 2);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    /*@Override
    public void move(int x, int y, int dx, int dy) {
        if (contain(x, y)) {
            getCenterD().setX(dx + getCenterD().getX());
            getCenterD().setY(dy + getCenterD().getY());
            //repaint();
            if ((float) getCenterD().getX() < (float) getSide() * Math.sin(Math.PI / 3)) {
                getCenterD().setX((int) (getSide() * (float) Math.sin(Math.PI / 3)));

            } else if ((float) getCenterD().getX() > 600 - (float) getSide() * Math.sin(Math.PI / 3)) {
                getCenterD().setX(600 - (int) (getSide() * (float) Math.sin(Math.PI / 3)));
            }

            if (getCenterD().getY() < getSide()) {
                getCenterD().setY(getSide());
            } else if (getCenterD().getY() >= 600 - getSide()) {
                getCenterD().setY(600 - getSide());
            }
            //repaint();
        }
    }*/
}