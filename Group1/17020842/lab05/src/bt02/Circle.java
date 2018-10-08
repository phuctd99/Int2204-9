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
public class Circle extends Shape{
    private static final double pi = Math.PI; // hằng số pi 3.14......
    private double radius;

    // khởi tạo mặc định
    public Circle() { radius = 1.0; }
    
    // khoải tạo với một tham số truyền vào <bán kính> 
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // khởi tạo với 3 tham số truyền vào
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // gọi đến phương thức khởi tạo của lớp cha
        this.radius = radius;
    }

    // get/ set
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    // trả về diện tích hình tròn
    public double getArea() { 
        return pi * this.radius * this.radius;
    }
    
    // trả về chu vi hình tròn
    public double getPerimeter() { 
        return 2 * pi * this.radius;
    }

    // trả về thông tin của đường tròn
    @Override
    public String toString() {
        return "Circle {" + "radius = " + radius + " Area = " + this.getArea() + " Perimeter = " + this.getPerimeter() + '}';
    }
}
