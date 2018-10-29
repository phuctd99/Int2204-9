package Try_Catch_Throw;

public class Subtraction {
    private Numeral left;
    private Numeral right;

    public Subtraction(Expression left, Expression right) {
        this.left = (Numeral)left;
        this.right = (Numeral)right;
    }

    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }

    public String toString() {
        return Integer.toString(evaluate());
    }

    public Expression left() {
        return left;
    }

    public Expression right() {
        return right;
    }
}
