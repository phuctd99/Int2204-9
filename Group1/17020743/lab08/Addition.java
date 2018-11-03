/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author CCNE
 */
public class Addition extends BinaryExpression {
 
    public Addition(Expression a, Expression b) {
        super(a, b);
    }
 
    @Override
    public String toString() {
        return String.format("%s + %s", left, right);
    }
 
    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
