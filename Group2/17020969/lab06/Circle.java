import java.util.Scanner;

public class Circle extends Shape{
    static final double PI = 3.14;
    private double radius; // khai bao ban kinh hinh tron
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mau: ");
        this.color = sc.nextLine();
        System.out.println("Nhap hoanh do: ");
        this.x = sc.nextDouble();
        System.out.println("Nhap tung do: ");
        this.y = sc.nextDouble();
    }
    @Override
    public double getArea(){
        return Math.pow(this.radius, 2) * PI;
    }
    /**
     *
     * @return
     */
    @Override
    public double getPerimeter() {
        return this.radius * 2 * PI;
    }
    @Override
    public String toString() {
        return "radius = " + radius + ", " + super.toString();
    }
    public static void main(String[] args) {
        Circle h1 = new Circle(3.0);
        System.out.println(h1.toString());
    }
}
