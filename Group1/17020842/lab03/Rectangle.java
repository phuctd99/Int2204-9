/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author CACLV
 */
public class Rectangle {
    private int length, width; // chiều dài and chiều rộng

    // contructor có tham số truyền vào là hai thuộc tính
    public Rectangle(int length, int width) {  
        this.length = length;
        this.width = width;
    }

    // các phương thức get/set
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    
    // hàm trả về diện tích của hình chữ nhật
    public int acreage(){
        return this.length * this.width;
    }
    
    // hàm trả về chu  vi hình chữ nhật
    public int perimeter(){
        return (this.length + this.width) * 2 ;
    }
    
    // hàm main test thử
    public static void main(String[] args) {
        // khởi tạo hình chữ nhật có chiều dài 10 chiều rộng 5
        Rectangle rectangle = new Rectangle(10,5);
        
        // in ra diện tích và chu vi
        System.out.println("acreage: " + rectangle.acreage() + "\nperimeter: " + rectangle.perimeter());
    }
}
