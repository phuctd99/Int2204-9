/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btt6;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author SONY
 */
public class Circle extends Shape {
    private int radius = 100;
    private Location O ;

    public Circle(Color color, Location O, int radius) {
        super(color);
        this.radius = radius;
        this.O = O;
    }

    public Location getO() {
        return O;
    }

    public void setO(Location O) {
        this.O = O;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public void move(Location a){
        setO(a);
    }
    //hàm vẽ hình Circle
    @Override
     public void paintShape(Graphics s){
         s.setColor(getColor());
         s.fillOval(O.getX(),O.getY(), radius, radius);
     }

}
