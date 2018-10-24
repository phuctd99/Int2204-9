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
public class Rectangle extends Shape {
   
   public Location o;
   private int length ;
   private int width ;

    public Rectangle(Color color) {
        super(color);
    }

   
    public Location getO() {
        return o;
    }

    public void setO(Location o) {
        this.o = o;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

  //hàm vẽ hình Rectangle
    @Override
     public void paintShape(Graphics s){
         s.setColor(getColor());
         s.fillRect(o.getX(), o.getY(),width, length);
     }

   // di chuyển hình 
    public void move(Location a){
        setO(a);
    }
}
