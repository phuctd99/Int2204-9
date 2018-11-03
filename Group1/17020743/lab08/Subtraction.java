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
public class Subtraction extends BinaryExpression {
 
    public Subtraction(Expression l, Expression r) {
        super(l, r);
    }
 
    @Override
    public String toString() {
        return String.format("%s - %s", left, right);
    }
 
    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }
}