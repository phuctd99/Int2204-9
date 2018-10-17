/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Admin
 */
public class Circle extends Shape{
    private double radius ;
    private toaDo I; // tâm hình tròn
    private final double PI = 3.14159 ;
    public Circle(){
        this.radius = 1.0;
        this.I = new toaDo(0, 0);
    }
    public Circle(double radius, toaDo center){
        this.radius = radius ;
        this.I = center;
    }
    public Circle(double radius , toaDo center, String c , boolean f){
        super(c, f) ;
        this.radius = radius ;
        this.I = center;
    }
    public double getRadius(){
        return radius ;
    }
    public void setRadius(double radius){
        this.radius = radius ;
    }
    public double getArea(){
        return PI*(this.radius * this.radius) ;
    }
    public double getPerimeter(){
        return 2*PI*radius ;
    }
    @Override
    public String toString(){
        return "Diện tích: " + this.getArea() + " | Chu vi: " + this.getPerimeter() + " | " + super.toString() + " | Bán kính: " + this.radius;
    }
}