package bai1;

public  class Numeral extends Expression {
    private int value;

    public Numeral(){}

    public Numeral(int value){
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int evaluate() {
        return this.value;
    }

    public String toString() {
        return "number";
    }

}
