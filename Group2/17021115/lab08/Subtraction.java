package Week8;

public class Subtraction extends BinaryExpression{
	
	public Subtraction(Expression left, Expression right) {
		super(left, right);
	}
	@Override
	public String toString() {
		String phepTru = "(" + this.left.toString() + " - " + this.right.toString() + ")"; 
		return phepTru;
	}

	@Override
	public int evaluate() {
		return this.left.evaluate() - this.right.evaluate();
	}

}
