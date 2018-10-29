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
public class Square extends Expression{
    private Expression expression;

    public Square(Expression e) {
        this.expression = e;
    }
    @Override
    public String toString() {
        //return expression + "^2";
        return String.format("(%s)^2", expression);
    }

    @Override
    public int evaluate() {
        return (int) Math.pow(expression.evaluate(), 2);
    }
    
}
