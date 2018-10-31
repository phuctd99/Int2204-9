/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

/**
 *
 * @author Admin
 */
public class Subtraction extends BinaryExpression{
    public Subtraction(Expression left, Expression right) {
		super(left, right);
	}
	@Override
	public String toString() {
		return getLeft().toString() + " - " + getRight().toString();
		
	}
	@Override
	public int evaluate() {
		return getLeft().evaluate() - getRight().evaluate();
	}
    
}
