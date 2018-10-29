/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopw8;

/**
 *
 * @author nguyenhuy
 */
public class Division extends BinaryExpression{
    private Expression left, right;

    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left() {
        return this.left;
    }

    @Override
    public Expression right() {
        return this.right;
    }

    @Override
    public String toString() {
        return "Division{" + "left=" + left + ", right=" + right + '}';
    }

    

    @Override
    public int evaluate() {
        return (this.left.evaluate() / this.right.evaluate());
    }
    
    
}
