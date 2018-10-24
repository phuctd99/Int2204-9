package Week7;

public class Rectangle extends Shape {

	private Point viTri;
	private int chieuDai;
	private int chieuRong;

	public Rectangle(Point viTri, int chieuDai, int chieuRong) {
		super();
		this.viTri = viTri;
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public Rectangle(String color, boolean filled, Point viTri, int chieuDai, int chieuRong) {
		super(color, filled);
		this.viTri = viTri;
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public Rectangle() {
	}

	public Point getViTri() {
		return viTri;
	}

	public void setViTri(Point viTri) {
		this.viTri = viTri;
	}

	public int getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}

	public int getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}

	public int getArea() {
		return (this.chieuDai * this.chieuRong);
	}

	public int getPerimeter() {
		return (this.chieuDai + this.chieuRong) * 2;
	}

	public void move(int x, int y) {
		viTri.setX(viTri.getX() + x);
		viTri.setY(viTri.getY() + y);

	}
}