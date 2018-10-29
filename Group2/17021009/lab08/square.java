package Cau1;

public class square extends expression {
    private expression expression;

    public square(expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return this.expression + "^2";
    }

    @Override
    public int evaluate() {
        return  this.expression.evaluate()*this.expression.evaluate();
    }
}
