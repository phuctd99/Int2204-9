import java.util.Scanner;

public class Circle extends Shape{

    static final double PI = 3.14;

    private Double radius;

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public void NhapThongTIn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập màu của hình");
        this.color = sc.nextLine();
        System.out.println("Nhập hoành độ của hình");
        this.x = sc.nextDouble();
        System.out.println("Nhập tung độ của hình");
        this.y = sc.nextDouble();
        System.out.println("Nhập bán kính");
        this.radius = sc.nextDouble();
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getArea(){
        return Math.pow(this.radius, 2) * PI;
    }
    public Double getPerimeter() {
        return this.radius * 2* PI;
    }

    @Override
    public String toString() {
        return "Circle{ " +
                "radius = " + radius +
                ", color = '" + color + '\'' +
                ", tam hinh tron = ( " + x + "," + y +")" +
                '}';
    }

}
