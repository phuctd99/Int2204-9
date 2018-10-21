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
public class Square extends Rectangle {

    public Square() {
        upperRight = new Point(0, 0);
        lowerLeft = new Point(1, 1);
    }

    public Square(double x1, double y1, double x2, double y2) {
        upperRight = new Point(x1, y1);
        lowerLeft = new Point(x2, y2);
    }

    public Square(double x1, double y1, double x2, double y2,
            String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        upperRight = new Point(x1, y1);
        lowerLeft = new Point(x2, y2);
    }

    public double getSide() {
        return Vector.getVectorLenght(lowerLeft, upperRight) / Math.sqrt(2);
    }

    @Override
    public boolean check() {
        return !this.upperRight.equals(this.lowerLeft);
    }

    @Override
    public double getArea() {
        return this.getSide() * this.getSide();
    }

    @Override
    public double getPerimeter() {
        return 4 * this.getSide();
    }

    @Override
    public String toString() {
        return "Square{" + "upperRight=" + upperRight.toString()
                + ", lowerLeft=" + lowerLeft.toString() + '}';
    }

}
