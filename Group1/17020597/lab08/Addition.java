/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab08;

/**
 *
 * @author Admin
 */
public class Addition extends BinaryExpression{
        
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return left().evaluate() + " + " + right().evaluate();
    }

    @Override
    protected int evaluate() {
        return left().evaluate() + right().evaluate();
    }
    
}
