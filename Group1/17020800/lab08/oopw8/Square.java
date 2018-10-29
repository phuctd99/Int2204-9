/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopw8;

/**
 *
 * @author nguyenhuy
 */
public class Square extends Expression{
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Square{" + "expression=" + expression + '}';
    }

    @Override
    public int evaluate() {
        return (int) Math.pow(this.expression.evaluate(), 2);
    }
    
}
