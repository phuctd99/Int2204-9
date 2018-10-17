/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

/**
 *
 * @author Hoang Vu Huong
 */
public class Circle extends Shape {

    private double radius;
    final double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getArea() {
        return (PI * 2 * radius);
    }

    public double getPerimeter() {
        return (PI * radius * radius);
    }

    @Override
    public String ToString() {
        return ("Circle: Chuvi:" + getArea() + "\nDienTich:" + getPerimeter());
    }
}
