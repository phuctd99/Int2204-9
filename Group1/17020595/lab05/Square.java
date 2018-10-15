/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_t5_b2;

/**
 * .cont
 * @author Administrator
 */
public class Square extends Rectangle{
    double side;
    Square (){
        
    }
    Square (double side){
        
    }
    Square (double side, String color, boolean filled){
        
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double side){
        this.side = side;
    }
    void setLenth(double side){
        this.side = side;
    }
    public double dienTich(){
        return side*side;
    }
    @Override
    public String toString(){
        return this.side + "\n" + this.dienTich();
    }

}
