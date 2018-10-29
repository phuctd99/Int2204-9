package task1;

public class Divison extends BinaryExpression {
    private Expression left;
    private Expression right;

    public Divison (Expression ex1, Expression ex2) {
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
        return left.toString() + " / " + right.toString();
    }

    @Override
    public int evaluate() throws ArithmeticException{
        if(right.evaluate() == 0) throw new ArithmeticException();
        return left.evaluate() / right.evaluate();
    }
}
