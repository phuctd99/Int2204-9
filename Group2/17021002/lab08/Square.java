/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap09;

/**
 *
 * @author VIETTEL
 */
public class Square extends Expression {
Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

   

    @Override
    int evaluate() {
        return expression.evaluate() *  expression.evaluate(); 
    }

    @Override
    public String toString() {
        if (expression instanceof Numeral && expression.evaluate() > 0 )
            return  expression.toString() + "^2";
        else return "(" + expression.toString() + ")^2" ; 
    }
    
    
    
}
    

