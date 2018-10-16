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
public class Circle extends Shape {
    public double radius = 1.0;
     public Location O = new Location();

    public Circle() {
    }

    public Location getO() {
        return O;
    }

    public void setO(Location O) {
        this.O = O;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    

}
