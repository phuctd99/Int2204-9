package task1;

public class Numeral extends Expression {
    private int value;
    public Numeral(int value) {
        this.value = value;
    }

    public Numeral() {
        this.value = 1;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public int evaluate() {
        return this.value;
    }
}
