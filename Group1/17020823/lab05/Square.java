/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

/**
 *
 * @author Hoang Vu Huong
 */
public class Square extends Rectangle {
   // private double side;
    public Square() {
        super();
    }
    public Square(double side) {
        super(side,side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setWidth(double side){
        this.setWidth(side);
    }
    @Override
    public void setLength(double side){
        this.setLength(side);
    }
    public String ToString(){
        return ("Square: color = "+ getColor()+ "\nChuvi tich :" + getArea() + "\nDienTich:"+getPerimeter())  ;
    }
}
