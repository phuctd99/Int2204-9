public class Multiplication extends BinaryExpression {

    // Constructor
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    // Trả về kết quả
    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }

}