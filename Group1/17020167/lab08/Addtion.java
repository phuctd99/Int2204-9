/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author Admin
 */
public class Addtion extends BinaryExpression{
    protected Expression left;
    protected Expression right;
    
    @Override
    public Expression left() {
        return this.left;
    }

    @Override
    public Expression right() {
        return this.right;
    }
    
    @Override
    public int evaluate() {
        return left.evaluate()+right.evaluate();
    }

    public Addtion(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "add";
    }
    
}
