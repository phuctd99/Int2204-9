// dùng final  cho biến Pi vì Pi là 1 hằng số
public class circle extends shape {
	static final double Pi = 3.14;
	private double radius = 1.0;
	public circle(double radius){
		super();
		this.radius = radius;
	}
	public circle(double radius, String color, boolean filled){
		super(color,filled);
		this.radius =radius;

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea(){
		return this.getRadius()*this.getRadius()*Pi;
	}
	public double getPerimeter(){
		return this.getRadius()*2*Pi;
	}
	@Override
	public String toString(){
		return this.getRadius()+"\n"+getArea()+"\n"+getPerimeter();
	}

	public static void main(String[] args) {
		shape s1 =new shape("red",true);
		System.out.println(s1.toString());
		circle h1= new circle(4.0);
		System.out.println(h1.toString());
	}
}
