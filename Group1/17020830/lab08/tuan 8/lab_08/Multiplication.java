/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_08;

/**
 *
 * @author admin
 */
public class Multiplication extends BinaryExpression{

    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }
    
    @Override
    public String toString(){
        return String.format("%s*%s",left,right);
    }
    
    
    @Override
    public int evalute(){
        return left.evalute() * right.evalute();
    }
    
    
    
}
