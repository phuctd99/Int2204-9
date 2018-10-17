/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan6;

/**
 *
 * @author CCNE
 */
public class Circle extends Shape{
    final double Pi = 3.14;
    protected double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    // ham khoi tao k tham so
    public Circle(){
        this.radius = 1.0;
    }
    // ham khoi tao 1 tham so
    public Circle(double radius)
    {
        this.radius = radius;
    }
    // ham khoi tao co tham so
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    // ham tinh dien tich
    public double getArea(){

        return Pi*radius*radius;
    }
    // ham tinh chu vi
    public double getPerimeter() {
        return 2*Pi*radius;
    }

    @Override
    public String toString() {
        return "Circle {" + "Pi=" + Pi + ", radius = " + radius + "}";
    }
}
