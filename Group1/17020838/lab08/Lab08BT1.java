package lab08bt1;
abstract class Expression {
    public abstract String toString();
    public abstract int evaluate();
}
class Numeral extends Expression{
    private int value;

    public Numeral() {
        this.value = 0;
    }

    public Numeral(int value) {
	this.value = value;
    }
    @Override
    public String toString() {
	String num = Integer.toString(value);
	return num;	
    }
    @Override
    public int evaluate() {
	return this.value;
    }
	
}
class Square extends Expression {
    private Expression expression;

    public Square(Expression expression) {
	this.expression = expression;
    }
    @Override
    public String toString() {
	String binhphuong = this.expression + "^2";
	return binhphuong;
    }
    @Override
    public int evaluate() {
	return (int) (this.expression.evaluate() * this.expression.evaluate());
    }
	
	
}
abstract class BinaryExpression extends Expression {
	
    public abstract Expression left(); 

    public abstract Expression right();


    @Override
    public abstract String toString();
    @Override
    public abstract int evaluate();
}
class Addtion extends BinaryExpression{
	
    private Expression left, right;
    public Addtion(Expression l, Expression r) {
        this.left = l;
        this.right= r;
    }
    @Override
    public Expression left() {
        return this.left;
    }
    @Override
    public Expression right() {
        return this.right;
    }
    @Override
    public String toString() {
	String add =  this.left.toString() + " + " + this.right.toString();
	return add;
    }
    @Override
    public int evaluate() {
	return this.left.evaluate() + this.right.evaluate();
    }
	
}
class Subtraction extends BinaryExpression{
	
    private Expression left, right;
    public Subtraction(Expression l, Expression r) {
        this.left = l;
        this.right= r;
    }
    @Override
    public Expression left() {
        return this.left;
    }
    @Override
    public Expression right() {
        return this.right;
    }
    @Override
    public String toString() {
	String sub = this.left.toString() + " - " + this.right.toString(); 
	return sub;
    }
    @Override
    public int evaluate() {
	return this.left.evaluate() - this.right.evaluate();
    }

}
class Multipcation extends BinaryExpression {
    private Expression left, right;
    public Multipcation(Expression l, Expression r) {
        this.left = l;
        this.right= r;
    }
    @Override
    public Expression left() {
        return this.left;
    }
    @Override
    public Expression right() {
        return this.right;
    }
    @Override
    public String toString() {
	String mul = this.left.toString() + "*" + this.right.toString();
	return mul;
    }
    @Override
    public int evaluate() {
	return this.left.evaluate() * this.right.evaluate();
    }

}
class Division extends BinaryExpression{
    private Expression left, right;
    public Division(Expression l, Expression r) {
        this.left = l;
        this.right = r;
    }
    @Override
    public Expression left() {
        return this.left;
    }
    @Override
    public Expression right() {
        return this.right;
    }
    @Override
    public String toString() {
	String div = this.left.toString() + " / " + this.right.toString();
	return div;
    }
    @Override
    public int evaluate() {
	return this.left.evaluate() / this.right.evaluate();
    }
}
class ExpressionTest {

    public static void main(String[] args) {
		
    Expression num1 = new Numeral(10); // 
    Expression num2 = new Numeral(1);  // 
    Expression num3 = new Numeral(2);  // Tạo các số cần thiết để tính toán  
    Expression num4 = new Numeral(3);  //
    Expression num5 = new Numeral(0);  //
		
    try {
        Expression chia = new Division(num1, num5); // Tạo ra ngoại lệ phép 
	System.out.println(chia.evaluate());        // chia cho 0
    } catch (ArithmeticException e) {               //
        System.out.println("Lỗi chia cho 0");     //
    }
		
    Expression s1 = new Square(num1);  // Tính 10^2
    Expression s2 = new Subtraction(s1, num2); // Tính 10^2 - 1
    Expression s3 = new Multipcation(num3, num4); // Tính 2*3
    Expression s4 = new Addtion(s2, s3); // Tính 10^2 - 1 + 2*3
    Expression ketQua = new Square(s4); // Tính (10^2 - 1 + 2*3)^2
    System.out.println("(" + s4.toString() + ")^2" + " = " + ketQua.evaluate());
    }

}
