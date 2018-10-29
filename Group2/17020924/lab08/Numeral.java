package Try_Catch_Throw;

public class Numeral implements Expression {
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

    public int evaluate() {
        return value;
    }

}
