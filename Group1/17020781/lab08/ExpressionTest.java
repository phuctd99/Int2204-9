abstract class Expression{
	public abstract String toString();

	public abstract double evaluate();

}

class Numeral extends Expression {
    private int value;

    public Numeral() { 
        this(0); 
    }
    public Numeral(int v) { 
        value = v; 
    }

        @Override
    public String toString() {
        return String.format("%d", value);
    }

    public double evaluate() {
        return value;
    }
}

class Square extends Expression {
    private Expression expression;

    public Square(Expression e) { 
        expression = e; 
    }

    @Override
    public String toString() {

        return String.format("(%s)^2", expression);
    }

    @Override
    public double evaluate() {
        return Math.pow(expression.evaluate(), 2);
    }
}

abstract class BinaryExpression extends Expression{
    protected Expression left;
    protected Expression right;

    public BinaryExpression(Expression l, Expression r) {
        left = l;
        right = r;
    }

    public Expression left() { return left; }
    public Expression right() { return right; }

    @Override
    public abstract String toString();
    @Override
    public abstract double evaluate();
}

class Addition extends BinaryExpression{
	public Addition(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public String toString() {
        return String.format("%s + %s", left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
class Subtraction extends BinaryExpression {

    public Subtraction(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public String toString() {
        return String.format("%s - %s", left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}

class Multiplication extends BinaryExpression {

    public Multiplication(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public Expression left() {
        return super.left();
    }

    @Override
    public Expression right() {
        return super.right();
    }

    @Override
    public String toString() {
        return String.format("%s * %s", left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }
}

class Division extends BinaryExpression {
    public Division(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public Expression left() {
        return super.left();
    }

    @Override
    public Expression right() {
        return super.right();
    }

    @Override
    public String toString() {
        return String.format("%s / %s", left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() / right.evaluate();
    }
}

public class ExpressionTest {

    public static void main(String args[]) {

        Expression num1 = new Numeral(10); //10
        Expression squ1 = new Square(num1); //10^2
        Expression num2 = new Numeral(1); //1
        Expression sub1 = new Subtraction(squ1, num2); //10^2 - 1
        Expression num3 = new Numeral(2); //2
        Expression num4 = new Numeral(3);  //3
        Expression mul1 = new Multiplication(num3,num4); //2*3
        Expression add1 = new Addition(sub1,mul1); // 10^2 - 1 + 2*3
        Expression sqr2 = new Square(add1); // (10^2 - 1 + 2*3)^2
     
        
        System.out.println(sqr2);
        System.out.println(sqr2.evaluate());
        try{
            System.out.println(9/0);
        } catch (ArithmeticException e){
           
            System.out.println("Chia cho 0");
        }


            
        
    }
}