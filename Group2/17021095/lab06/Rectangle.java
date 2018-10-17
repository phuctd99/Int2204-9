/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btt6;

/**
 *
 * @author SONY
 */
public class Rectangle extends Shape {
   public double height = 1.0;
   public double width = 1.0;
   public Location x1 = new Location();
   public Location x2 = new Location();
     
    public Rectangle() {
    }

    public Location getX1() {
        return x1;
    }

    public void setX1(Location x1) {
        this.x1 = x1;
    }

    public Location getX2() {
        return x2;
    }

    public void setX2(Location x2) {
        this.x2 = x2;
    }
   

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
}
