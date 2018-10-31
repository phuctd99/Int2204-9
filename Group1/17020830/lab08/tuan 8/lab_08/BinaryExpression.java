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
public abstract class BinaryExpression extends Expression{
    protected Expression left;
    protected Expression right;
    
    @Override
    public abstract int evalute();
    @Override
    public abstract String toString();
    
    

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }
    
    public BinaryExpression(Expression left , Expression right){
        this.left = left;
        this.right = right;
        
    }
    
}
