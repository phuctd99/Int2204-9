package Week7;

public class Square extends Rectangle {
	private Point viTri;
	private int side;

    public Square() {}
    
 
    public Square(Point viTri, int side) {
        super(viTri, side, side);
    }

    public Square(String color, boolean filled, Point viTri, int side) {
        super(color, filled, viTri, side, side);
    }


	public Point getViTri() {
		return viTri;
	}


	public void setViTri(Point viTri) {
		this.viTri = viTri;
	}


	public int getSide() {
		return side;
	}


	public void setSide(int side) {
		this.side = side;
	}
}