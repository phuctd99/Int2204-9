/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Tommmm^^
 */
public class Circle extends Shape {
    double radius;
    final private double PI = 3.14;
    public Circle(){
        radius = 1.0;
        
    }
    public Circle(double radius) {
        this.radius = radius;
        
    }
    public Circle(double radius,boolean fill ,String color) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        System.out.println(PI*(radius*radius));
         return PI*(radius*radius);
    }
     public double getPerimeter(){
        return 2*PI*radius;
    }
}
