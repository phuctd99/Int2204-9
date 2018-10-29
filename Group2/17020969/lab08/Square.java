public class Square extends Expression{
    private Expression expression;
    public Square(Expression e){
        this.expression = e;
    }
    
    @Override
    public int evaluate() {
        return (int) Math.pow(expression.evaluate(), 2);
    }

    @Override
    public String toString() {
        return expression + "^2";
    }

}
