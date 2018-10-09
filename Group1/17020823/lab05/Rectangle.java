/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

/**
 *
 * @author Hoang Vu Huong
 */
public class Rectangle extends Shape{

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    private double width;
    private double length;

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

    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }
    public double getArea(){
        return 2*(length + width);
    }
    public double getPerimeter(){
        return (length * width);
    }
    @Override
    public String ToString(){
        return ("Rectangle: Chuvi:"+getArea() + "\n DienTich"+getPerimeter());
    }
}
