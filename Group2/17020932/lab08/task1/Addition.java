package task1;

public class Addition extends BinaryExpression {
    private Expression left;
    private Expression right;

    public Addition (Expression e1, Expression e2) {
        this.left = e1;
        this.right = e2;
    }

    @Override
    public Expression left() {
        return this.left;
    }

    @Override
    public Expression right() {
        return this.right;
    }

    @Override
    public String toString() {
        String result = left.toString() + " + " + right.toString();
        return result ;
    }

    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
