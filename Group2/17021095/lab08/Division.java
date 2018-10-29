/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btt7_2;
public class Division extends BinaryExpression{
    public Division(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public String toString() {
		String div =  getLeft().toString() + " / " + getRight().toString() ;
		return div;
	}

	@Override
	public int evaluate() {
		return getLeft().evaluate() / getRight().evaluate();
	}
}
