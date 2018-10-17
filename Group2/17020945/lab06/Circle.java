import java.util.Scanner;

public class Circle extends Shape{

	static final double PI = 3.14;

	private Double radius = 1.0;

	public Circle() {
	}

	public Circle(Double radius) {
		this.radius = radius;
	}

	@Override
	public void ThongTIn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap mau cua hinh:");
		this.color = sc.nextLine();
		System.out.println("nhap hoanh do cua hinh:");
		this.x = sc.nextDouble();
		System.out.println("nhap tung do cua hinh");
		this.y = sc.nextDouble();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public double getArea(){
		return Math.pow(this.radius, 2) * PI;
	}
	public double getPerimeter() {
		return this.radius * 2* PI;
	}

	@Override
	public String toString() {
		return "radius = " + radius + super.toString();
	}

	public static void main(String[] args) {
		Circle h1 = new Circle(3.0);
		System.out.println(h1.toString());
	}

}
