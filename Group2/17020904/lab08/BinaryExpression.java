package Lab081;

public abstract class  BinaryExpression extends Expression {
    public Expression left;
    public Expression right;

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }


}
