/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_t8;

/**
 *
 * @author Administrator
 */
public class Multiplication {
    private Expression left, right;
    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this .right = right;
    }
    public Expression left(){
        return this.left;
    }
    public Expression right(){
        return this.right;
    }

    @Override
    public String toString() {
        return "Addition{" + "left=" + left + ", right=" + right + '}';
    }
    
    public int evalute(){
        return (this.left.evaluate() * this.right.evaluate());
    }
}
