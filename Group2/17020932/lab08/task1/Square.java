package task1;

public class Square extends Expression{
    private Expression expression;

    public Square (Expression e) {
        this.expression = e;
    }

    @Override
    public String toString() {
        return "(" + this.expression.toString() + ")" + "^2";
    }

    @Override
    public int evaluate() {
        return this.expression.evaluate() * this.expression.evaluate();
    }
}
