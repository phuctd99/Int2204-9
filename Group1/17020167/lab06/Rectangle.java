/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Admin
 */
public class Rectangle extends Shape {

    protected Point upperRight;
    protected Point upperLeft;
    protected Point lowerLeft;

    public Rectangle() {
        this.upperRight = new Point(0, 1);
        this.upperLeft = new Point(1, 1);
        this.lowerLeft = new Point(1, 0);
    }

    public Rectangle(double x1, double y1, double x2, double y2,
            double x3, double y3) {
        this.upperRight = new Point(x1, y1);
        this.upperLeft = new Point(x2, y2);
        this.lowerLeft = new Point(x3, y3);
    }

    public Rectangle(double x1, double y1, double x2, double y2,
            double x3, double y3, String color, boolean filled) {
        super(color, filled);
        this.upperRight = new Point(x1, y1);
        this.upperLeft = new Point(x2, y2);
        this.lowerLeft = new Point(x3, y3);
    }

    public Point getUpperRight() {
        return upperRight;
    }

    public void setUpperRight(Point upperRight) {
        this.upperRight = upperRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public Point getLowerLeft() {
        return lowerLeft;
    }

    public void setLowerLeft(Point lowerLeft) {
        this.lowerLeft = lowerLeft;
    }

    @Override
    public boolean check() {
        return Vector.getScalarProduct(upperRight, upperLeft, upperLeft, lowerLeft) == 0;
    }

    public double getWidth() {
        return Vector.getVectorLenght(upperRight, upperLeft);
    }

    public double getLength() {
        return Vector.getVectorLenght(lowerLeft, upperLeft);
    }

    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    public double getPerimeter() {
        return 2 * (this.getLength() + this.getWidth());
    }

    @Override
    public String toString() {
        return "Rectangle{" + "upperRight=" + upperRight.toString()
                + ", upperLeft=" + upperLeft.toString()
                + ", lowerLeft=" + lowerLeft.toString() + '}';
    }

}
