/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author Admin
 */
public class Square extends Rectangle {
    
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public Double getSide() {
        return super.getWidth();
    }
     
    public Square() {
        new Rectangle();
    }
    public Square(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        Square square = new Square(2.5, "green", true);
        System.out.println(square.toString());
    }
}
