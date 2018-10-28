package Week8;

public class Division extends BinaryExpression{
	public Division(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public String toString() {
		String phepNhan = "(" + this.left.toString() + " / " + this.right.toString() + ")";
		return phepNhan;
	}

	@Override
	public int evaluate() {
		return this.left.evaluate() / this.right.evaluate();
	}
}
