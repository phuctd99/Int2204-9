package bai2;

public class shape {
	private String color;
	private boolean filled;
	public shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public shape() {
		this.color = "red";
		this.filled = true;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return this.getColor() + "," + this.isFilled();
	}
}
