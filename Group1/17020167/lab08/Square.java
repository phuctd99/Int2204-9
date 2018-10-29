/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author Admin
 */
public class Square extends Expression{
    protected Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
    
    
    @Override
    public int evaluate() {
        return (int) Math.pow(expression.evaluate(), 2);
    }

    @Override
    public String toString() {
        return "square";
    }
    
}
