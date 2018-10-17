public abstract class Shape {
	protected double x;
	protected double y;
	protected String color = "red";
	public Shape() {
	}

	public abstract void ThongTIn();
	public abstract double getArea();
	public abstract double getPerimeter();

	@Override
	public String toString() {
		return "x = " + x + ", y = " + y + ", color " + color ;
	}
}
