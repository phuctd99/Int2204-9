/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap08;

/**
 *
 * @author Hoang Vu Huong
 */
public class Addition extends BinaryExpression{
    private Expression left, right;

    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    
    @Override
    public Expression left() {
       return left;
    }

    @Override
    public Expression right() {
        return right;
        
    }

    @Override
    public String toString() {
        return left.toString() + "+" + right.toString();
    }

    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
    
}
