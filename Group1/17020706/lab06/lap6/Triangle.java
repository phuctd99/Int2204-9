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
public class Triangle extends Shape {

    int side1, side2, side3;

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }
    // Constructor
    public Triangle(int side1, int side2, int side3, String colorString, boolean filled) {
        super(colorString, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    // Return info
    @Override
    public String getInfo() {
        return "Triangle => Side: " + side1 + " " + side2 + " " + side3 + " Color: " + colorString + " Filled: " + filled;
    }

}
