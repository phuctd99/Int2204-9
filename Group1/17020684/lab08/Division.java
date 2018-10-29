
package tuan_8;

/**
 *
 * @author hangdinh
 */
public class Division extends BinaryExpression{
    public Division(Expression l, Expression r) {
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
        return String.format("%s / %s", right , left);
    }

    @Override
    public int evaluate() {
        return (right.evaluate() / left.evaluate());
    }
}
