import java.util.Scanner;

public class Triangle extends Shape {

	private double c1, c2, c3;

	public Triangle() {
	}

	public Triangle(double c1, double c2, double c3) {
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
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
		double a=(this.c1+this.c2+this.c3)/2;
		return Math.sqrt(a*(a-this.c1)*(a-this.c2)*(a-this.c3));
	}

	@Override
	public double getPerimeter() {
		return (this.c1 + this.c2 + this.c3);
	}

	@Override
	public String toString() {
		return "c1 = " + c1 + ", c2 = " + c2 + ", c3 = " + c3 +", "+super.toString();
	}

	public static void main(String[] args) {
		Shape sh = new Triangle(3, 4, 5);
		System.out.println(sh.toString());
		System.out.println("Dien tich hinh tam giac: "+ sh.getArea());
		System.out.println("Chu vi hinh tam giac: "+ sh.getPerimeter());
	}
}
