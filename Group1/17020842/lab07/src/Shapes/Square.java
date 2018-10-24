/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

import java.awt.Color;
import location.Location2D;

/**
 *
 * @author CACLV
 */
public class Square extends Rectangle {

    public Square(Location2D firstD, int length, int width, Color color, boolean filled) {
        super(firstD, length, width, color, filled);
    }
    
    @Override
    public boolean isSame(Shape shape) {
        if (this instanceof Square && shape instanceof Square) {
            return this.firstD.isSame(((Square) shape).firstD) && this.getSide() == ((Square) shape).getSide();
        }
        return false;
    }

    public int getSide() {
        return this.getLength();
    }

    public void setSide(int side) {
        this.setLength(side);
        this.setWidth(side);
    }

//    @Override
//    public void setWidth(int side) {
//        this.setSide(side);
//    }
//
//    @Override
//    public void setLength(int side) {
//        this.setSide(side);
//    }

}

