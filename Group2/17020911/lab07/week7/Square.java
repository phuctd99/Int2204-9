/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.awt.Graphics;

/**
 *
 * @author Admin
 */
public class Square extends Rectangle {

    public Square(int side, int x, int y, String color, boolean filled, boolean visible) {
        super(side, side, x, y, color, filled, visible);
    }
    public double getSide()
    {
        return this.getWidth();
    }
    public void setSide(int side)
    {
        this.setWidth(side);
        this.setLength(side);
    }
    
    @Override
    public String toString() {
        return "Square{" + getSide() + '}';
    }

    
}