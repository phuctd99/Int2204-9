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
public class Numeral extends Expression {
    private int value;
 
    public Numeral() { 
        this(0); 
    }

    public Numeral(int value) {
        this.value = value;
    }

    Numeral(Expression add) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString() {
        return String.format("%d", value);
    }
 
    @Override
    public float evaluate() {
        return value;
    }
}
