/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap6;

/**
 *
 * @author DELL
 */
public class Square extends Rectangle {

    public void setSide(double side) {
        this.width = this.height = side;
    }

    public double getSide() {
        return this.width;
    }

    public Square(double side, String colorString, boolean filled) {
        super(side, side, colorString, filled);
    }

    @Override
    public void setWidth(double side) {
        this.width = this.height = side;
    }

    @Override
    public void setHeight(double side) {
        this.height = this.width = side;
    }
    // Return info
    @Override
    public String getInfo() {
        return "Square => " + "Color: " + this.colorString + " Side: " + this.width + " Filled: " + filled;
    }

}
