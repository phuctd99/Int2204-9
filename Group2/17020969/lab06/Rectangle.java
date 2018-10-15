import java.util.Scanner;
public class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle() {
    }
    public Rectangle(double width_, double length_) {
        this.width = width_;
        this.length = length_;
    }
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
    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mau: ");
        this.color = sc.nextLine();
        System.out.println("Nhap hoanh do: ");
        this.x = sc.nextDouble();
        System.out.println("Nhap tung do:");
        this.y = sc.nextDouble();
    }
    @Override
    public double getArea() {
        return this.width * this.length;
    }
    @Override
    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }
    @Override
    public String toString() {
        return "chieu dai = " + width + ", chieu rong = " + length + ", " + super.toString();
    }
    // chay thu test
    public static void main(String[] args) {
        Rectangle h2 = new Rectangle();
        h2.setLength(3);
        h2.setWidth(2);
        System.out.println("Dien tich: " + h2.getArea());
        System.out.println("Chu vi: " + h2.getPerimeter());
    }
}
