package ExceptionTuan8;

public class Numeral extends Expression{
    protected int value;

    public Numeral(){
        this.value = 0;
    }

    public Numeral(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%d", value);
    }

    @Override
    public int evaluate() {
        return value;
    }
}
