package oop_t8;


public class Square extends Expression{
    private Expression expression;
    
    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Square{" + "expression=" + expression + '}';
    }

 

    @Override
    public int evaluate() {
        return (int) Math.pow(this.expression.evaluate(), 0);
    }
    
}
