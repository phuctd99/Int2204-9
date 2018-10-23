package oop_tuan6;

public class Hexagon extends Shape{
	int[] xHex;
	int[] yHex;
	
	Hexagon(int x, int y, String Color, int[] xHex, int[] yHex) {
		super(x,y,Color);
		this.xHex = xHex;
		this.yHex = yHex;
		
	}
	
	public int[] getxHex() {
		return xHex;
	}
	public void setxHex(int[] xHex) {
		this.xHex = xHex;
	}
	public int[] getyHex() {
		return yHex;
	}
	public void setyHex(int[] yHex) {
		this.yHex = yHex;
	}





	@Override
	int getWidth() {
		return 0;
	}

	@Override
	int getLength() {
		return 0;
	}

	@Override
	int[] getYT() {
		return null;
	}

	@Override
	int[] getXT() {
		return null;
	}

	@Override
	int getRadius() {
		return 0;
	}

	@Override
	boolean getIsSquare() {
		return false;
	}
	
}
