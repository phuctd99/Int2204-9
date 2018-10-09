/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Tommmm^^
 */
public class Square extends   Rectange {
    double side;
    public Square(){
        side = 1.0;
    }
    public Square(double side){
        this.side =side;
    }
    public Square(double side, String color, boolean filled){
        super();
        this.side =side;
        
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
     public void setWidth(double side) {
        this.side = side;
    }
    
    @Override
    public void setLength(double side) {
        this.side = side;
    }
}
