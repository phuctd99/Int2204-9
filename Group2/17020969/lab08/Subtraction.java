public class Subtraction extends BinaryExpression{
    private Expression left;
    private Expression right;
    public Subtraction(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    @Override
    public Expression left(){
        return this.left();
    }
    @Override
    public Expression right(){
        return this.right();
    }
    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }
    @Override
    public String toString() {
        return "Subtraction = " + left + " - " + right;
    }
}
