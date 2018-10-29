
public class Addition extends BinaryExpression {

    // Constructor
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    // Trả về kết quả
    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }

}
