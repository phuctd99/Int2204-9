/*
- Có 3 quan hệ thừa kế:
	+) circle thừa kế shape.
	+) rectangle thừa kế shape.
	+) square thừa kế rectangle.
- circle không thừa kế rectangle vì trong retangle không co các thuộc tính mà circle cần tới.
*/
public class shape {
	private String color = "red";

	private boolean filled = true;

	public shape(){
		color = "";
		filled = true;
	}

	public shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
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
	@Override
	public String toString(){
		return this.getColor() + "\n" + this.isFilled();
	}

	public static void main(String[] args) {
		shape s1 =new shape("red",true);
		System.out.println(s1.toString());
		square square = new square(5);
		System.out.println(square.getArea());

	}
}
