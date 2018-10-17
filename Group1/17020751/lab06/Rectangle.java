/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan6;

/**
 *
 * @author CCNE
 */
// hinh chu nhat
public class Rectangle extends Shape{
    protected double width,length;
    // get.set chieu rong
    public void setWidth(double width) {

        this.width = width;
    }
    public double getWidth() {

        return width;
    }
    // get.set chieu dai
    public void setLength(double length) {

        this.length = length;
    }
    public double getLength() {
        return length;
    }
    // ham khoi tao
    public Rectangle(){
             this.length = 1.0;
             this.width = 1.0;
    }
    //ham khoi tao 2 tham so
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    // khoi tao co tham so
    public Rectangle(double width, double length, String color, boolean filled){
       super(color,filled);
       this.width = width;
       this.length = length;
    }
    // ham tinh dien tich
    public double getArea(){

        return width*length;
    }
    // ham tinh chu vi
    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle {" + "length = " + length + ", width = " + width +"}";
    }
}
