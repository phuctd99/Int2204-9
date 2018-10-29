
package tuan_8;

/**
 *
 * @author hoangdinh
 */
public abstract class BinaryExpression extends Expression{
    protected Expression left;
    protected Expression right;
    public BinaryExpression(Expression l, Expression r) {
        this.left = l;
        this.right = r;
    }
 
    public Expression left() { 
        return left; 
    }
    
    public Expression right() { 
        return right; 
    }
    
    @Override
    public abstract String toString();
    @Override
    public abstract int evaluate();
    
}
