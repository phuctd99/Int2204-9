/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05.Shape;

/**
 *
 * @author admin
 */
public class Rectangle extends Shape{
    protected double dai;
    protected double rong;

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean isFilled() {
        return filled;
    }

    @Override
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public Rectangle(double dai, double rong){
        this.dai = dai;
        this.rong = rong;
     }
    
    public double getDienTich(){
        return dai*rong;
    }
     public double getChuvi(){
         return (dai+rong)*2;
     }
     
    
}
