package Da_hinh;

public class Circle extends Shape{

	private double radius;
	
	public void Input() {
		super.Input();
		System.out.println("Nhap ban kinh hinh tron: ");
		setRadius(super.scan.nextDouble());
		
	}
	
	
	
	public void Output() {
		
		System.out.println("==========Circle==========");
		super.Output();
		System.out.println("Ban kinh la: " + radius);
	
	}
	
	
	
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//2 hinh giong nhau
	public boolean sameCircle(Circle c) {
		
		if(x == c.x && y == c.y && radius == c.radius) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
}
