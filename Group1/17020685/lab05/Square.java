/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author HP
 */
public class Square extends Rectangle {
    public Square(){
        super(1.0,1.0);
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setWidth(double side) {
        this.setSide(width);
    }
    @Override
    public void setLength(double side) {
        this.setSide(length);
    }

    @Override
    public String toString() {
        return "This is Square";
    }

   

    
    
}
