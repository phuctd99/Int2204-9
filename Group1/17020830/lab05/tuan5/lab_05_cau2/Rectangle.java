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
public class Rectangle extends Shape{
    protected double width ;
    protected double length;

    public Rectangle() {
        
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return this.length*this.width;
        
    }
    public double getPerimeter(){
        return (this.length+this.width)*2;
    }
    
    public Rectangle(String color, boolean filled,double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public String toString(){
        return super.toString()+"  Rectangle";
    }
    
    
    
    
    
}
