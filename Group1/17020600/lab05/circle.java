/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baituan5_2;

/**
 *
 * @author CCNE
 */
public class circle extends shape{
    private double radius;
    final private double PI =3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public circle(){
        radius = 1.0;
    }
    public circle(double radius){
        this.radius = radius;
    }
    public circle(double radius, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }
    public double getArea(){//dien tich hinh tron
        return PI*radius*radius;
    }
    public double getPerimeter(){//chu vi hinh tron
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return "circle{" + '}';
    }
    
}
