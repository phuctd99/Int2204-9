/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baituan8;

/**
 *
 * @author pc
 */
public class Square extends Expression {
    private final Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }
    @Override
    public String toString(){
        return String.format("(%s)^2", expression);
    }

    /**
     *
     * @return
     */
    @Override
    public float evaluate(){
        return (float) Math.pow(expression.evaluate(), 2);
    }
}
