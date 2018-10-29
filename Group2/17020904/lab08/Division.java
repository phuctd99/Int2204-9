package Lab081;

public class Division extends BinaryExpression{
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        String div =  "(" + this.left.toString() + " + " + this.right.toString() + ")";
        return div;
    }

    @Override
    public int evaluate() {

        return left.evaluate() / right.evaluate();
    }
}
