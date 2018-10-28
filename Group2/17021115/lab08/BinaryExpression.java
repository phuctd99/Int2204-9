 package Week8;

public abstract class BinaryExpression extends Expression {
	protected Expression left;
	protected Expression right;
	
	public BinaryExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
    public Expression getLeft() {
		return left;
	}

	public Expression getRight() {
		return right;
	}



	@Override
    public abstract String toString();
    @Override
    public abstract int evaluate();
}
