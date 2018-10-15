/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author HP
 */
public class Circle extends Shape{
    protected double radius,area,perimeter;
    protected  final double PI=3.14;
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*PI;
    }

    public double getPerimeter() {
        return 2*radius*PI;
    }    

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", area=" + area + ", perimeter=" + perimeter + ", PI=" + PI + '}';
    }

    
}
