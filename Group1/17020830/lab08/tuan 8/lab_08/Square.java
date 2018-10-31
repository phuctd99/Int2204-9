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
public class Square extends Expression{
    private Expression expression;
    
    public Square(Expression expression){
        this.expression = expression;
    }
     public int evalute(){
         return expression.evalute() * expression.evalute();
    }
    
    @Override
    public String toString(){
        return String.format("(%s)^2", expression) ;
    }
    
    
    
}
