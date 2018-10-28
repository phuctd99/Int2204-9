package Week8;

public class Multipcation extends BinaryExpression {
	public Multipcation(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public String toString() {
		String phepNhan = "(" + this.left.toString() + " x " + this.right.toString() + ")";
		return phepNhan;
	}

	@Override
	public int evaluate() {
		return this.left.evaluate() * this.right.evaluate();
	}

}
