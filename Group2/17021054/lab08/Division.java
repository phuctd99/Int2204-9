public class Division extends Expression {

    private Numeral left;
    private Numeral right;

    public Division(Expression left, Expression right) {
        this.left = (Numeral) left;
        this.right = (Numeral) right;
    }

    public int getValue() {
        return left.getValue() / right.getValue();
    }

    public String toString() {
        return Integer.toString(getValue());
    }

    public Expression left() {
        return left;
    }

    public Expression right() {
        return right;
    }
}
