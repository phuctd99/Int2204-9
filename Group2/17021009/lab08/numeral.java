package Cau1;

public class numeral extends expression {
    private int value;

    public numeral() {
    }

    public numeral(int value) {
        this.value = value;
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
