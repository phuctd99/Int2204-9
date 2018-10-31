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
public class Square extends Expression {
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }
    
    @Override
    protected int evaluate() {
        return (int) Math.pow(expression.evaluate(), 2);
    }

    @Override
    public String toString() {
        return expression.evaluate() + "^2";
    }
    
}
