/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baituan5_2;

/**
 *
 * @author CCNE
 */
public class square extends rectangle {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public square(){
        side = 1.0;
    }
    public square(double side){
        this.side = side;
    }
    public square(double side, String color, boolean filled)
    {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    @Override
    public void setWidth(double side){
        this.width = side;
    }
    @Override
    public void setLength(double side){
        this.length = side;
    }
    @Override
    public String toString() {
        return "square{" + '}';
    }
    
}
