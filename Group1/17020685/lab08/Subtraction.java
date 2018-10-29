/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan_8;

/**
 *
 * @author HP
 */
public class Subtraction extends BinaryExpression{

    public Subtraction(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public Expression left(){
        return super.left();
    }
    
    @Override
    public Expression right() {
        return super.right();
    }
    
    @Override
    public String toString() {
        return String.format("%s - %s", right , left);
    }

    @Override
    public int evaluate() {
        return right.evaluate() - left.evaluate();
    }
    
    
}
