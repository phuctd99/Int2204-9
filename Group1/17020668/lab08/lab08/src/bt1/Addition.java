package bt1;

public class Addition extends BinaryExpression {
    private Expression left;
    private Expression right;

    public Addition(Expression left, Expression right){
        this.left = left;
        this.right = right;
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
        return "Addition{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
