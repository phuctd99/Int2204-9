package Week8;

public class Square extends Expression {
	private Expression expression;

	public Square(Expression expression) {
		this.expression = expression;
	}
	@Override
	public String toString() {
		String binhPhuong = "(" + this.expression + "^2)";
		return binhPhuong;
	}
	@Override
	public int evaluate() {
		return (int) Math.pow(this.expression.evaluate(), 2);
	}
	
	
}
