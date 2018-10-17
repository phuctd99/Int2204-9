public class rectangle extends shape {
	private double width = 1.0;

	private double length = 1.0;

	public rectangle(){
		super();
	}

	public rectangle(double width, double length){
		super();
		this.width = width;
		this.length = length;
	}

	public rectangle(double width, double length, String color, boolean filled){
		super(color,filled);
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

	public double getArea(){
		return this.width * this.length;
	}

	public double getPerimeter() {
		return (this.width + this.length) * 2;
	}
	@Override
	public String toString(){
		return this.getWidth() + " " + this.getLength() + "\n" + this.getPerimeter() + "\n" + this.getArea();
	}

	public static void main(String[] args) {
		shape s1 =new shape("red",true);
		System.out.println(s1.toString());
		rectangle h1 = new rectangle(5.0, 2.0);
		System.out.println(h1.toString());
	}
}
