package Lab081;

public class Subtraction extends BinaryExpression {
    public Subtraction (Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        String sub =  "(" + left.toString() + " - " + right.toString() + ")";
        return sub;
    }

    @Override
    public int evaluate() {

        return left.evaluate() - right.evaluate();
    }
}
