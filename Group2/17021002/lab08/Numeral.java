/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap09;

/**
 *
 * @author VIETTEL
 */
public class Numeral extends Expression {
   int value;

    public Numeral(int a) {
        this.value = a;
    }
    @Override
    int evaluate(){
        return value;
    }

    
    public String toString() {
        return value + " "; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
