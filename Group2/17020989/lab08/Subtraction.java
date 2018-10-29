public class Subtraction extends BinaryExpression {

    // Constructor
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    // Trả về kết quả
    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }

}
