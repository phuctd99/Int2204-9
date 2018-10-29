
package tuan_8;

/**
 *
 * @author hoangdinh
 */
public class Square extends Expression{
    
    private Expression expression;
    
    public Square(Expression e) {
        this.expression = e;
    }
    @Override
    public String toString() {
        return String.format("(%s)^2", expression);
    }

    @Override
    public int evaluate() {
        return (int) Math.pow(expression.evaluate(), 2);
    }
    
}
