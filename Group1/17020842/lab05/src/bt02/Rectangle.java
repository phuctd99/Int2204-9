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
public class Rectangle extends Shape {
    private double width; // chiều rộng
    private double length;// chiều dài

    // contructor mặc định 
    public Rectangle() {
        this.width = this.length = 1.0;
    }

    //contructor có 2 tham số truyền vào là chiều dài, rộng
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    //contructor có đầy đủ các tham số truyền vào
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled); // gọi đến phương thức khởi tạo của lớp cha
        this.width = width;
        this.length = length;
    }

    
    //get/set
    public double getWidth() {
        return width;
        //Rectangle r = new ("red", true); // không kế thừa phương thức khởi tạo
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

    // trả về diện tích hình chữ nhật
    public double getArea() { 
        return this.width * this.length;
    }
    
    // trả về chu vi hình chữ nhật
    public double getPerimeter() { 
        return 2 * (this.width + this.length);
    }
    
    //trả về thông tin của hình chữ nhật < chiều dài, rộng>
    @Override
    public String toString() {
        return "{" + "width = " + width + ", length = " + length + " Area = " + this.getArea() + " Perimeter = " + this.getPerimeter() + '}';
    }
 
}
