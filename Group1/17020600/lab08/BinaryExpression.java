/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baituan8;

/**
 *
 * @author pc
 */
public abstract class BinaryExpression extends Expression{
    protected Expression left;
    protected Expression right;

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    public Expression left(){
        return left;
    }
    public Expression right(){
        return right;
    }
    @Override
    public abstract String toString();
    @Override
    public abstract float evaluate();
}
