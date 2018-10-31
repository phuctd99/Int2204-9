package lab08;

public class Numeral extends Expression {
    private int value;
    
    public Numeral(int value) {
        this.value = value;
    }

    public Numeral() {
        value = 0;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public int evaluate() {
        return value;
    }
}
