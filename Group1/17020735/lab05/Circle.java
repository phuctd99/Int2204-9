/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 * trừu tượng hóa lớp Circle kế thừa từ lớp Shape
 * @author Nguyễn Quang Hiệp
 */
public class Circle extends Shape{
    private double radius = 1.0;
    private final double PI = 3.14;
    Circle() {}
    Circle (double radius) {
        this.radius = radius;
    }
    Circle (double radius, String colorString,boolean filled) {
        this.radius = radius;
        super.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "@radius" + radius;
    }
}
