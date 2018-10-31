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
public class Numeral extends Expression {
    int value;
     Numeral(int value) {
        this.value = value;
    }
     Numeral() {
        this.value = 1;
    }

    @Override
    public String toString() {
          return "Numeral{" + "value=" + value + '}';
    }

    @Override
    public int evaluate() {
        return this.value;
        
    }
}
