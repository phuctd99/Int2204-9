/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author CCNE
 */
public class Division extends BinaryExpression{
    public Division(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public String toString() {
		String div =  "(" + this.left.toString() + " / " + this.right.toString() + ")";
		return div;
	}

	@Override
	public int evaluate() {
		return this.left.evaluate() / this.right.evaluate();
	}
}
