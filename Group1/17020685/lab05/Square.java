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
    protected double side;
    public Square(){
        
    }
    public Square(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public Square(double side, String color, boolean filled){
        super.setLength(side);
        super.setWidth(side);
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double side) {
        this.width = side;
    }
    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }

    
    
}
