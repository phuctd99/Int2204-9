import java.util.Scanner;
public class Triangle extends Shape {
    private double x1, x2, x3;
    public Triangle() {
    }
    public Triangle(double x1_, double x2_, double x3_) {
        this.x1 = x1_;
        this.x2 = x2_;
        this.x3 = x3_;
    }
    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mau:");
        this.color = sc.nextLine();
        System.out.println("Nhap hoanh do: ");
        this.x = sc.nextDouble();
        System.out.println("Nhap tung do: ");
        this.y = sc.nextDouble();
    }
    @Override
    public double getArea() {
        double p = (this.x1 + this.x2 + this.x3) / 2;
        double s1 = p * (p - this.x1) * (p - x2) * (p - this.x3);
        double s = Math.sqrt(s1);
        s = Math.round((s1 * 100) / 100);
        return s;
    }
    @Override
    public double getPerimeter() {
        return (this.x1 + this.x2 + this.x3);
    }
    @Override
    public String toString() {
        return "canh 1 = " + x1 + ", canh 2 = " + x2 + ", canh 3 = " + x3 + super.toString();
    }
    public static void main(String[] args) {
        Shape h1 = new Triangle(3, 4, 5);
        //System.out.println(h1.toString());
        System.out.println("Dien tich: " + h1.getArea());
    }
}
