/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_05_cau2;

/**
 *
 * @author admin
 */
public class Circle extends Shape{
    private final double PI = 3.14;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return PI*this.radius*this.radius;
    }
    public double getPerimeter(){
        return 2*PI*this.radius;
    }
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
        
    }
    @Override
    public String toString(){
        return super.toString()+"  Circle";
    }
    
    
    
}
