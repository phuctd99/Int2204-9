/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author hieu
 */
public class Numeral extends Expression{
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Numeral(int x) {
        this.value = x;
    }

    public Numeral(){
    }

    @Override
    public int evaluate() {
        return this.value;
    }

    @Override
   public String toString() {
        return Integer.toString(value);
    }
    
    
    
}
