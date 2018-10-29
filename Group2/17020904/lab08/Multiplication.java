package Lab081;

public class Multiplication extends BinaryExpression{
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        String mul =  "(" + left.toString() + " * " + right.toString() + ")";
        return mul;
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
