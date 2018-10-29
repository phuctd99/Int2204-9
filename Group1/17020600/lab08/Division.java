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
public class Division extends BinaryExpression {
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public Expression right() {
        return super.right(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression left() {
        return super.left(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString() {
        return String.format("(%s) / (%s)", left, right);
    }
    @Override
    public float evaluate(){
        return left.evaluate() / right.evaluate();
    }
}
