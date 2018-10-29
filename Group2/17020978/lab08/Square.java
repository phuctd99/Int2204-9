package lab08;

public class Square extends Expression {

    Expression expression;

    Square(Expression expression)
    {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Expresstion" + this.expression;
    }

    @Override
    public int evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
}
