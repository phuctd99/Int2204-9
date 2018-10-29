/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expression;

/**
 *
 * @author Dell
 */
public abstract class BinaryExpression extends Expression{
    abstract Expression left();
    abstract Expression right();
    
    
}
