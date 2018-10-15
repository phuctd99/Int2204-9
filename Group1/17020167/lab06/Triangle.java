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
public class Triangle extends Shape  {

    protected Point vertex1;
    protected Point vertex2;
    protected Point vertex3;

    public Triangle() {
        vertex1 = new Point();
        vertex2 = new Point();
        vertex3 = new Point();
    }

    public Triangle(double x1, double y1, double x2, double y2,
            double x3, double y3) {
        vertex1 = new Point(x1, y1);
        vertex2 = new Point(x2, y2);
        vertex3 = new Point(x3, y3);
    }

    public Triangle(double x1, double y1, double x2, double y2,
            double x3, double y3, String color, boolean filled) {
        super(color, filled);
        vertex1 = new Point(x1, y1);
        vertex2 = new Point(x2, y2);
        vertex3 = new Point(x3, y3);
    }

    public Point getVertex1() {
        return vertex1;
    }

    public Point getVertex2() {
        return vertex2;
    }

    public Point getVertex3() {
        return vertex3;
    }

    public void setVertex1(Point vertex1) {
        this.vertex1 = vertex1;
    }

    public void setVertex2(Point vertex2) {
        this.vertex2 = vertex2;
    }

    public void setVertex3(Point vertex3) {
        this.vertex3 = vertex3;
    }

    @Override
    public boolean check() {
        if (this.getSide1() + this.getSide2() <= this.getSide3()) {
            return false;
        }
        if (this.getSide1() + this.getSide3() <= this.getSide2()) {
            return false;
        }
        if (this.getSide2() + this.getSide3() <= this.getSide1()) {
            return false;
        }
        return true;
    }

    public double getSide1() {
        return Vector.getVectorLenght(vertex1, vertex2);
    }

    public double getSide2() {
        return Vector.getVectorLenght(vertex1, vertex3);
    }

    public double getSide3() {
        return Vector.getVectorLenght(vertex2, vertex3);
    }

    public double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - this.getSide1()) * (p - this.getSide2()) * (p - this.getSide3()));
    }

    public double getPerimeter() {
        return this.getSide1() + this.getSide2() + this.getSide3();
    }

    @Override
    public String toString() {
        return "Triangle{" + "vertex1=" + vertex1.toString()
                + ", vertex2=" + vertex2.toString()
                + ", vertex3=" + vertex3.toString() + '}';
    }

}
