package Week8;

public class Addtion extends BinaryExpression{
	
	public Addtion(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public String toString() {
		String phepCong =  "(" + this.left.toString() + " + " + this.right.toString() + ")";
		return phepCong;
	}

	@Override
	public int evaluate() {
		return this.left.evaluate() + this.right.evaluate();
	}
	
}
