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
public class Numeral extends Expression{
    int value;

    public Numeral(int v) {
        this.value = v;
    }

    public Numeral() {
        value = 0;
    }
    
    
    @Override
    int evaluate(){
        return value;
    }

    
    public String toString() {
        return value + " "; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
