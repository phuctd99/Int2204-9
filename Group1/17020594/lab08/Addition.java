/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author Tommmm^^
 */
public class Addition extends BinaryExpression {
    Expression left;
    Expression right;

    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    
     @Override
    public String toString() {
        return "Addition{" + "left=" + left + ", right=" + right + '}';
    }

    

    public int evaluate() {
        return (this.left.evaluate() + this.right.evaluate());
    }
    
}
