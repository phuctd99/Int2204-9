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
public class Square extends Rectangle {
    // khởi tạo mặc định
    public Square() {
        super(); // gọi đến hàm khởi tạo mặc định của lớp cha
    }
    // khởi tạo có tham số là kích thước của hình vuông
    public Square(double side) {
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
    public void setWidth(double side) {
         this.setSide(side);
    }

    @Override
    public void setLength(double side) {
        this.setSide(side);
    }
    
}
