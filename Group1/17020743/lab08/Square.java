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
public class Square extends Expression {
    private Expression expression ;
    public Square(Expression e) {expression = e; }
    @Override
    public String toString() {
        return String.format("(%s)^2", expression) ;     
    }
    
    @Override
    public int evaluate() {
        return (int) Math.pow(expression.evaluate(), 2) ;
    }
    
}
