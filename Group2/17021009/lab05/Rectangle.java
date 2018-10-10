package Cau2;

public class Rectangle extends Shape {
    private double width;
    private double length;

    //Phương thức khởi tạo không có tham số
    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    //Phương thức khởi tạo có 2 tham số width và length
    public Rectangle( double width, double length) {
        this.length = length;
        this.width = width;
    }

    //Phương thức khởi tạo với 4 tham số width, length, color, filled
    public Rectangle( double width, double length, String color, boolean filled) {
        super( color, filled);
        this.width = width;
        this.length = length;
    }

    //Phương thức get/set
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

    //Tính diện tích hình chữ nhật
    public double getArea() {
        return width*length;
    }

    //Tính chu vi hình chữ nhật
    public double getPerimeter() {
        return ( width + length ) * 2;
    }

    public String toString() {
        return "HCN chiều dài " + this.length + " chiều rộng " + this.width + " có chu vi " + this.getPerimeter() + " có diện tích " + this.getArea();
    }
}
