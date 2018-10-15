/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 * trừu tượng lớp rectangle kế thừa từ lớp shape
 * @author Nguyễn Quang Hiệp
 */
public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }
    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super.setColor(color);
        super.setFilled(filled);
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return super.toString() + "@width:" + width + "@length:" + length; 
    }
    
}
