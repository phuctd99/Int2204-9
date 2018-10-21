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
public class Circle extends Shape {

    protected double radius;
    protected Point centre;

    public Circle() {
        this.radius = 1;
        this.centre = new Point();
    }

    public Circle(double radius) {
        this.radius = radius;
        this.centre = new Point();
    }

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.centre = new Point(x, y);
    }

    public Circle(double radius, double x, double y, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.centre = new Point(x, y);
    }

    @Override
    public boolean check() {
        return this.radius >= 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius
                + ", centre= " + centre.toString() + '}';
    }

}
