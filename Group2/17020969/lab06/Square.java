import java.util.Scanner;
public class Square extends Shape {
    private double canh;
    public Square() {
    }
    public Square(double canh_) {
        this.canh = canh_;
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
    public double getArea() {
        return Math.pow(canh, 2);
    }
    @Override
    public double getPerimeter() {
        return canh * 4 ;
    }
    @Override
    public String toString() {
        return "canh =" + canh + ", " + super.toString();
    }
    public static void main(String[] args) {
        Square sq = new Square(2);
        System.out.println("Chu vi hinh vuong: " + sq.getPerimeter());
        System.out.println("Dien tich hinh vuong: " + sq.getArea());
    }
}
