package bt1;

public  class Square extends Expression {
    private Expression expression;

    public Square(Expression expression){
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Square{" +
                "expression=" + expression +
                "^2" +
                '}';
    }

    @Override
    public int evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
}
