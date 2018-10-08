/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baituan5_2;

/**
 *
 * @author CCNE
 */
public class rectangle extends shape {
    protected double width;
    protected double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public rectangle(){
        width = 1.0;
        length = 1.0;
    }
    public rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public rectangle(double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getArea(){//dien tich hinh chu nhat
        return width*length;
    }
    public double getPerimeter(){//chu vi hinh chu nhat
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "rectangle{" + '}';
    }
    
}
