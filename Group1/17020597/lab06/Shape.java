/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.lab6;

/**
 *
 * @author Admin
 */
public abstract class Shape {
    private String color = "red";
    private boolean filled = true;
    public void setColor(String color) {this.color = color; }
    public String getColor() {return this.color; }
    public void setFilled(boolean filled) {this.filled = filled; }
    public boolean isFilled() {return this.filled; }
    
    public Shape() {
        this.color = "red";
        this.filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public abstract String getNameShape();
   
}
