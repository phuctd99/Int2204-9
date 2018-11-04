package Tuan8;

public class Subtraction extends BinaryExpression {
  public Subtraction(Expression l, Expression r) {
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
    return String.format("%s - %s", right , left);
  }

  @Override
  public int evaluate() {
    return right.evaluate() - left.evaluate();
  }
}
