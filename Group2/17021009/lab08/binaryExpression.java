package Cau1;

public abstract class binaryExpression extends expression {
    protected expression left;
    protected expression right;

    public binaryExpression(expression left, expression right) {
        this.left = left;
        this.right = right;
    }

    public expression getLeft() {
        return left;
    }

    public expression getRight() {
        return right;
    }
}
