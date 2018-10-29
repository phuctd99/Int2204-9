public class Square extends Expression {
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }
    @Override
    public String toString() {
        return ("(" +expression + " ^ " + 2 +")");
    }
    @Override
    public int evaluate() {
        return (int) (expression.evaluate()*expression.evaluate() );
    }

}
