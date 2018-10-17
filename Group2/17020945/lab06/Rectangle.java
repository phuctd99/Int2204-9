import java.util.Scanner;

public class Rectangle extends Shape {

	private Double width;

	private Double length;

	public Rectangle() {
	}

	public Rectangle(Double width, Double length) {
		this.width = width;
		this.length = length;
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
	public void ThongTIn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap mau cua hinh:");
		this.color = sc.nextLine();
		System.out.println("nhap hoanh do cua hinh:");
		this.x = sc.nextDouble();
		System.out.println("nhap tung do cua hinh:");
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
		return "width = " + width + ", length = " + length + super.toString();
	}

	public static void main(String[] args) {
		Rectangle h1 = new Rectangle(2.0, 1.0);
		h1.ThongTIn();
		System.out.println(h1.toString());
		System.out.println("----------------------------");
		Rectangle h2 = new Rectangle();
		h2.setLength(3);
		h2.setWidth(2);
		System.out.println(h2.getArea());
	}
}
