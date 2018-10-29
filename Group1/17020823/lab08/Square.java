/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap08;

/**
 *
 * @author Hoang Vu Huong
 */
public class Square extends Expression{
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        if(expression instanceof Numeral)
        return expression.toString() + "^2";
        else
            return "(" + expression.toString()+")^2";
    }

    @Override
    public int evaluate() {
        return new Multiplication(expression, expression).evaluate();
    }
    
}
