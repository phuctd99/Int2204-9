package oop_t8;

public class Addition extends BinaryExpression {
    private Expression left, right;
    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public Expression left(){
        return this.left;
    }
    @Override
    public Expression right(){
        return this.right;
    }

    @Override
    public String toString() {
        return "Addition{" + "left=" + left + ", right=" + right + '}';
    }
    public int evalute(){
        return (this.left.evaluate() + this.right.evaluate());
    }

    @Override
    public int evaluate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
