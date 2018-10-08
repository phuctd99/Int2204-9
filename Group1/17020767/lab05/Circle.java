/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05.Shape;

/**
 *
 * @author admin
 */
public class Circle extends Shape{
    private double radius ;
    private final double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double getDienTich(){
        return PI*radius*radius;
    }
    public double getChuVi(){
        return 2*PI*radius;                
    }
    
    
    
}
