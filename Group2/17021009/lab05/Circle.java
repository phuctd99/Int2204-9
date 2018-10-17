package Cau2;

public class Circle extends Shape {
    final double pi = 3.14;

    private double radius;

    //Phương thức khởi tạo không có tham số
    public Circle() {
        radius = 1.0;
    }

    //Phương thức khởi tạo có một tham số là radius
    public Circle( double radius) {
        this.radius = radius;
    }

    //Phương thức khởi tạo có 3 tham số là radius, color, filled
    public Circle( double radius, String color, boolean filled) {
        super( color, filled);
        this.radius = radius;
    }

    //Phương thức get/set
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Hàm tính diện tích
    public double getArea() {
        return pi*this.radius*this.radius;
    }

    //Tính chu vi
    public double getPerimeter() {
        return 2*pi*this.radius;
    }

    public String toString() {
        return "Hình tròn bán kính " + this.radius + " có chu vi " + this.getPerimeter() + ", diện tích " + this.getArea();
    }
}
