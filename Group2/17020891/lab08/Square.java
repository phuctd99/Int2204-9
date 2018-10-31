package com.company;

public class Square implements Expression {
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "(" + expression.toString() +")^2 ";
    }

    @Override
    public int evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
}
