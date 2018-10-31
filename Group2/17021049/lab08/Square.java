package bai1;

public class Square extends Expression {

    private Expression expression;

    public Square(Expression expression){
        this.expression = expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public int evaluate() {
        return (int) Math.pow(expression.evaluate(), 2);
    }

    public String toString() {
        return "square";
    }

}
