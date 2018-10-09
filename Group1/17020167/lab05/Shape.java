/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author Admin
 */
//class Shape
public class Shape {
    protected String color = "red";
    protected boolean filled = true;
    //Constructor
    public Shape() {
    }
    public Shape(String color,boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    //getter and setter
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
    //toString
    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }
    
    
    
}
