public class Numeral extends Expression {
    private int value;

    public Numeral(int value) {
        this.value = value;
    }

    public Numeral() {
        this.value = 0;
    }

    public String toString() {
        return Integer.toString(value);
    }

    public int getValue() {
        return value;
    }
}
