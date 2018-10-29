package task1;

public class Subtraction extends BinaryExpression {
    private Expression left;
    private Expression right;

    public Subtraction(Expression ex1, Expression ex2) {
        this.left = ex1;
        this.right = ex2;
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
        return left.toString() + " - " + right.toString();
    }

    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
