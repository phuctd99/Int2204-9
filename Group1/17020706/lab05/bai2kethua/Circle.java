/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2kethua;

/**
 *
 * @author Nguyễn Giang
 */
public class Circle extends Shape {
    final double PI = 3.14;
    double radius;
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public Circle() {
        this.radius = 1.0;
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    // Tra ve dien tich
    public double getArea() {
        return radius * radius * PI;
    }
    // Tra ve chu vi
    public double getPremeter() {
        return 2 * radius * PI;
    }
    
    // Tra ve thong tin
    public String toString() {
        return ("Ban kinh: " + radius + "\n" + 
                "Dien tich: " + getArea() + "\n" + 
                "Chu vi: " + getPremeter() + "\n");
    }
}
