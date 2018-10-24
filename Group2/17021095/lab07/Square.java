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
public class Square extends Rectangle {
    public int side ;

    public Square(Color color, double side) {
        super(color);
        side = this.side;
    }
    
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    //hàm vẽ hình Square
        @Override
     public void paintShape(Graphics s){
         s.setColor(getColor());
         s.fillRect(o.getX(), o.getY(),side, side);
     }
     
     
}
