package mainPackage;

public class Numeral extends Expression{
    private int value;
    public Numeral() {
        this.value = 0;
    }
    public Numeral (int number) {
        this.value = number;
    }

    @Override
    public String toString() {
        return "" + value;
    }
    @Override
    public int evalute() {
        return this.value;
    }
}
