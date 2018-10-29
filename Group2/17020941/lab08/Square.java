package mainPackage;

public class Square extends  Expression{
    private Expression expression;
    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "" + this.expression.evalute() + "^2";
    }

    @Override
    public int evalute() {
        return this.expression.evalute() * this.expression.evalute();
    }
}
