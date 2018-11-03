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
public class Numeral extends Expression {
    private int value;
 
    public Numeral() { this(0); }
    public Numeral(int v) { value = v; }
 
    @Override
    public String toString() {
        return String.format("%d", value);
    }
 
    @Override
    public int evaluate() {
        return value;
    }
}