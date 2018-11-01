public class Numeral implements Expression {
    private int value;

    public Numeral(int value) {
        this.value = value;
    }  // ham khoi tao

    public Numeral() {
        this.value = 0;
    } // ham khoi tao mac dinh

    public String toString() {
        return Integer.toString(value);
    }   // ham tao ra String

    public int evaluate() {
        return value;
    } // ham lay gia tri

}
