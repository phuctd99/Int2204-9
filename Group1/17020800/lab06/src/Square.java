import java.util.Scanner;

public class Square extends Shape {


    private Double x1, x2, x3;

    private Double y1, y2, y3;

    public Square() {
    }

    public Square(Double x1, Double x2, Double x3, Double y1, Double y2, Double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
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
        System.out.println("Nhập tọa độ điểm thứ 1");
        this.x1 = sc.nextDouble();
        this.y1 = sc.nextDouble();
        System.out.println("Nhập tọa độ điểm thứ 2");
        this.x2 = sc.nextDouble();
        this.y2 = sc.nextDouble();
        System.out.println("Nhập tọa độ điểm thứ 3");
        this.x3 = sc.nextDouble();
        this.y3 = sc.nextDouble();
    }

    @Override
    public Double getArea() {
        return null;
    }

    @Override
    public Double getPerimeter() {
        return null;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge = " + Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2) ) +
                ", color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}