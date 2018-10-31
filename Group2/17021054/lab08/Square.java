public class Square extends Expression {
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return Integer.toString(getValue());
    }

    @Override
    public int getValue() {
        return expression.getValue() * expression.getValue();
    }
}
