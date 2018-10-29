public class Division extends BinaryExpression {

    // Constructor
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    // Trả về kết quả
    @Override
    public int evaluate() {
        try {
            return left.evaluate() / right.evaluate();
        } catch (ArithmeticException e) {
            System.out.println("Lỗi chia cho 0!");
            return Integer.MAX_VALUE ;
        }
    }

}
