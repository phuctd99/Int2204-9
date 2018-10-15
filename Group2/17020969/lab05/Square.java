public class Square extends Rectangle {

    public Square(){
        //new Rectangle();
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
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
		// TODO Auto-generated method stub
		this.setSide(side);
	}
	@Override
	public void setLength(double side) {
		// TODO Auto-generated method stub
		this.setSide(side);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getSide() + "\nChu vi hinh vuong: " + this.getPerimeter() + "\nDien tich hinh vuong: " + this.getArea();
	}

    public static void main(String[] args) {
        Square h1 = new Square(2.0);
        System.out.println(h1.toString());
    }
}
