public class square extends rectangle {
	public square(){
		super();
	}
	public  square (double side){
		super(side,side);
	}
	public  square(double side, String color, boolean filled){
		super(side,side,color,filled);
	}

	public double getSide() {
		return this.getWidth();
	}

	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}

	@Override
	public void setWidth(double side) {
		this.setSide(side);
	}

	@Override
	public void setLength(double side) {
		this.setSide(side);
	}

	@Override

	public String toString(){
		return this.getSide() + "\n" + this.getPerimeter() + "\n" + this.getArea();
	}

	public static void main(String[] args) {
		shape s1 =new shape("red",true);
		System.out.println(s1.toString());
		square h1 = new square(4.0);
		System.out.println(h1.toString());
	}
}
