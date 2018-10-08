/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author CACLV
 */
public class Shape {
    
    public String color; // màu sắc
    public boolean filled; //

    // khởi tạo mặc định
    public Shape() {
        this.color = "red";
        this.filled = true;
    }
    
    // khởi tạo có tham số truyền vào
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // các phương thức get/set
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // trả về thông tin đầy đủ của đối tượng
    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }
    
}
