/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author hieu
 */
public class Square extends Expression{
    public Expression expression;
      
    public Square(Expression ex){
        expression = ex;
    }

    @Override
    public String toString() {
        if (expression instanceof  Numeral)
            return  expression.toString() + "^2";
        else return  "(" + expression.toString() + ")";
    }

    @Override
    public int evaluate() {
        return expression.evaluate()*expression.evaluate();
    }
    
}
