/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_06;

/**
 *
 * @author admin
 */
public class Square extends Shape{
    protected double side;
    public Square(String color,double x, double y, double side) {
        super(color,x,y);
        this.side = side;
    }
   
    
    public Square(){
        
    }
    public Square(double side){
        this.side = side;
    }
    
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void del(){
        System.out.println("sadsad");
        
    }
    
}
