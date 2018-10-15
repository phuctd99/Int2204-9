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
public class Rectangle extends shape {
    double width = 1, length = 1;
    Rectangle (){
        
    }
    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
    }
    public double getWidth () {
        return width;
    }
    public void setWidth (double width) {
        this.width = width;
    }
    public double getLength () {
        return length;
    }
    public void setLength (double length) {
        this.length = length;
    }
    @Override
    public String toString(){
        return this.width + "\n" + this.length;
    }
    public double getArea(){
        return width*length;
    }
    public double Perimeter(){
        return 2*(width + length);
    }
    

}
