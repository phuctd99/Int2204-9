/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap07;

/**
 *
 * @author ADMIN
 */
public class Square extends Shape {
    protected double side;
    

    public Square() {
        super();
        this.side = 1.0;
    
    }

    public Square(double side) {
        super();
        this.side = side;
    }

    
    public Square(int x, int y, boolean isMove, boolean isColor, double side) {
        super(x, y, isMove, isColor);
        this.side = side;
        
    }

    

    public void setSide(double side) {
        this.side = side;
       
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return side*side;
    }
}
