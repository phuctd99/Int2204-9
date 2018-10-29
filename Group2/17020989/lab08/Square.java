
public class
Square extends Expression {

    Expression ep;

    public Expression getEp() {
        return ep;
    }

    public void setEp(Expression ep) {
        this.ep = ep;
    }

    // Constructor
    public Square(Expression ep) {
        this.ep = ep;
    }

    // Trả về thông tin biểu thức
    @Override
    public String toString() {
        return "Biểu thức bình phương: " + ep.toString();
    }

    // Trả về kết quả
    @Override
    public int evaluate() {
        return ep.evaluate() * ep.evaluate();
    }

}

