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
public class Division extends BinaryExpression{
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
    public int evaluate () throws ArithmeticException{
        if(right.evaluate()==0) {
        try {
            return left.evaluate()/right.evaluate();
        } catch (Exception e) {
            System.out.print("Bieu thuc chia bang ");
            return right.evaluate();
        }
        }
        return left.evaluate()/right.evaluate();
    }

    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "div";
    }
}
