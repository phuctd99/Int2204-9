/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan6;

/**
 *
 * @author CCNE
 */
public class Square extends Rectangle{

    public Square() {
    }
    public Square(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    public Square(double side, String color, boolean filled) {
        super.setLength(side);
        super.setWidth(side);
        super.setColor(color);
        super.setFilled(filled);
    }
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    public double getSide() {
        return super.getLength();
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }
    
    @Override
    public String toString() {
        return  getClass().getName() + "@"+ Integer.toHexString(hashCode()) + 
                "@" +color + "@filled:" + isFilled() + "@side:" + getLength() ;
    }
}

