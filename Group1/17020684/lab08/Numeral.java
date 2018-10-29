
package tuan_8;

/**
 *
 * @author hoangdinh
 */
public class Numeral extends Expression {
    private int value;
    
    public Numeral(int value){
        this.value = value;
    }
    
    public Numeral(){
        this.value = 10;
    }
    
    @Override
    public String toString() {
        return value + "";
    }
    
    @Override
    public int evaluate() {
        return value;
    }
}
