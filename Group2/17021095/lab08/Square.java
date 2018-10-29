/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btt7_2;

public class Square extends Expression{
    private Expression expression;

	public Square(Expression expression) {
		this.expression = expression;
	}
	@Override
	public String toString() {
		return "(" + expression.toString() + "^2)";		
	}
	@Override
	public int evaluate() {
		return  (int) Math.pow((int)this.expression.evaluate(), 2);
	}
}
