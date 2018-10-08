/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_t5_b2;

/**
 *
 * @author Administrator
 */
public class Circle  extends shape{
    public double radius = 1;
    public final double PI = 3.14 ; //nen de final vi no se giup chuong trinh k phai co them thao tac kt nhung bien bthuong 
    Circle (){
        
    }
    Circle (double radius){
        
    }
    Circle (double radius, String color, boolean filled){
        
    }
    public double getRadius () {
        return radius;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    double chuVi(){
        return 2*radius*PI;
    }
    @Override
    public String toString(){
        return this.chuVi() + "\n" + this.dienTich();
    }
    double dienTich(){
        return PI*radius*radius;
    }
}
