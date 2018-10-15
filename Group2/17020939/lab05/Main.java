package Cau2;

public class Main {
	public static void main(String agrs[]) {
		Shape shape = new Shape("blue",true);
		shape.InFor();
		Cirlce cirlce = new Cirlce(2.5,"blue", true);
		cirlce.InFor();
		Rectangle rectangle = new Rectangle(4,6.5,"green",true);
		rectangle.InFor();
		Square square = new Square(4,"green",true);
		square.InFor();
	}
}
