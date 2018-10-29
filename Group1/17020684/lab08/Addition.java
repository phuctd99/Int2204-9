
package tuan_8;

/**
 *
 * @author hoangdinh
 */

public class Addition extends BinaryExpression{
    public Addition(Expression l, Expression r) {
        super(l, r);
    }
    
    @Override
    public Expression left(){
        return super.left();
    }
    
    @Override
    public Expression right() {
        return super.right();
    }
    
    @Override
    public String toString() {
       return left.evaluate() + " + " + right.evaluate();
    }

    @Override
    public int evaluate() {
        return right.evaluate() + left.evaluate();
    }
}
