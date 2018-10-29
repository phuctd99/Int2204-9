package mainPackage;

public class addition extends Expression {
    private Expression left,  right;
    public addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public String toString() {
        return this.left.toString() + "  " + this.right.toString();
    }

    @Override
    public int evalute() {
        return this.left.evalute() + this.right.evalute();
    }
}
