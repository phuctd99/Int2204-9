package mainPackage;

public class Main extends  Expression{
    public static void main(String[] args) {
        Expression ex = new Expression();
        Expression a = new Numeral(10);
        Expression sqare1 = new Square(a);
        Expression b = new Numeral(1);
        Expression subtraction1 = new subtraction(sqare1, b);
        Expression c = new Numeral(2);
        Expression d = new Numeral(3);
        Expression multiplication1 = new multiplication(c, d);
        Expression addition1 = new addition(subtraction1, multiplication1);
        Expression result = new Square(addition1);
        System.out.println(result.evalute());
        try {
            Expression e = new Numeral(0);
            division di = new division(a, e);
            System.out.println(di.evalute());
        } catch (ArithmeticException e) {
            System.out.println("loi chia cho 0");
        }
    }
}
