/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2kethua;

/**
 *
 * @author Nguyễn Giang
 */
public class Square extends Rectangle {

    double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square() {
        this.width = this.length = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    

    @Override
    public String toString() {
        return ("Do dai canh: " + getSide() + "\n"
                + "Dien tich: " + getArea() + "\n"
                + "Chu vi: " + getPremeter() + "\n");
    }

}
