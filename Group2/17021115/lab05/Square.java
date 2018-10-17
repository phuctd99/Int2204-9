package HinhHoc;

public class Square extends Rectangle {
	
	public Square() {
		super();
	}
	public Square(double side) {
		super(side, side);
	}
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
        public void setWidth(double side) {
		this.width = side;
                this.length = side;
	}
	public void setLength(double side) {
		this.width = side;
                this.length = side;
	}
	public void setSide(double side) {
		super.width = side;
                super.length = side;
	}
	public double getSide() {
		return super.width;
	}
	public double getArea() {
		return super.getArea();
	}
	public double getPerimeter() {
		return super.getPerimeter();
	}
	public String toString() {
		return "Hình vuông có chu vi: " + getPerimeter() + "\nDiện tích: " + getArea() + "\nMàu: " + super.getColor() + "\nfilled: " + super.isFilled();
	}
}