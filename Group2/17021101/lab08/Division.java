package com.company;

public class Division extends BinaryExpression{
    private Expression left;
    private Expression right;

    public Division(Expression left, Expression right) {
        this.left = (Numeral)left;
        this.right = (Numeral)right;
    }

    public String toString() {
        return left.toString() + " / " +right.toString();
    }

    public int evaluate() {
        return left.evaluate() / right.evaluate();
    }

    public Expression left() {
        return left;
    }

    public Expression right() {
        return right;
    }
}