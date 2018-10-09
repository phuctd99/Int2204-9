/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
//import java.util.*;
public final class Square extends Rectangle {
    

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        this.setLength(side);
        this.setWidth(side);
    }
    
    public Square()
    {
      width =1.0;
    }
    Square( double side)
    {
        this.setLength(side);
        this.setWidth(side);
    }
    Square(double side, String color,boolean filled )
    {
        setLength(side);
        setWidth(side);
        setColor(color);
        setFilled(filled);
    }
   
    public void setWidth(double side) {
        
        super.setWidth(side);

        super.setLength(side);
    }
    public String toString()
    {
        return super.toString();
    }
     public static void main(String[] args) {
        Square S= new Square(3.0,"red",true);
        //System.out.println(C.getPerimeter());
        //System.out.println(C.getArea());
        System.out.println(S.toString());
    }
}
