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
public class Triangle extends Shape {   
    public Location x1 = new Location();
    public Location x2 = new Location();
    public Location x3 = new Location();
    public Triangle() {  }
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

    public Location getX3() {
        return x3;
    }

    public void setX3(Location x3) {
        this.x3 = x3;
    }
    
    
    
}
