
public class Numeral extends Expression {

    int value;

    // Constructor
    public Numeral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Trả về thông tin number
    @Override
    public String toString() {
        return "Giá trị number: " + value;
    }

    // Trả về kết quả
    @Override
    public int evaluate() {
        return value;
    }

}