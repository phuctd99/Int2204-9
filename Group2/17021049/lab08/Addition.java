package bai1;

public class Addition extends BinaryExpression {

    private Expression left, right;

    public Addition(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression left() {
        return this.left;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public Expression right() {
        return this.right;
    }

    public int evaluate() {
        return left.evaluate()+right.evaluate();
    }


    public String toString() {
        return "add";
    }

}
