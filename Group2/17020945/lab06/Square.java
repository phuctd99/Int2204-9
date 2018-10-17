import java.util.Scanner;

public class Square extends Shape {

	private double edge;

	public Square() {
	}

	public Square(double edge) {
		this.edge = edge;
	}

	@Override
	public void ThongTIn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap  mau cua hinh:");
		this.color = sc.nextLine();
		System.out.println("nhap hoanh do cua hinh:");
		this.x = sc.nextDouble();
		System.out.println("hap tung do cua hinh:");
		this.y = sc.nextDouble();
	}

	@Override
	public double getArea() {
		return Math.pow(edge, 2);
	}

	@Override
	public double getPerimeter() {
		return edge * 4 ;
	}

	@Override
	public String toString() {
		return "edge=" + edge + super.toString();
	}

	public static void main(String[] args) {
		Square sq = new Square(4);
		System.out.println("chu vi hinh vuong: "+sq.getPerimeter());
	}
}
