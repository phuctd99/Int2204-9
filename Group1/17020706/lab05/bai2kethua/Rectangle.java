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
public class Rectangle extends Shape {
    double width;
    double length;

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
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    // Hàm trả về diện tích 
    public double getArea() {
        return this.width * this.length;
    }
    // Hàm trả về chu vi
    public double getPremeter() {
        return 2 * (this.width + this.length);
    }
    // Tra ve thong tin
    public String toString() {
        return ("Chieu rong: " + width + "\n" +
                "Chieu dai: " + length + "\n" + 
                "Dien tich: " + getArea() + "\n" + 
                "Chu vi: " + getPremeter() + "\n");
    }
}
