package lab08;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression ex1 = new Numeral(30);
        Expression ex2 = new Numeral(10);

        Addition addition = new Addition(ex1, ex2);
        int a = addition.evaluate();
        System.out.println(a);

        Multiplication multiplication = new Multiplication(ex1, ex2);
        int b = multiplication.evaluate();
        System.out.println(b);

        Subtraction subtraction = new Subtraction(ex1, ex2);
        int c = subtraction.evaluate();
        System.out.println(c);

        Division division = new Division(ex1, ex2);
        int d = division.evaluate();
        System.out.println(d);

        Expression e1 = new Numeral(10);
        Expression e2 = new Numeral(0);

        try {
            Division division1 = new Division(e1, e2);
            int x = division1.evaluate();
            System.out.println(x);
        } catch (ArithmeticException ariex) {
            System.out.println("Ngoai le");
        }


        Expression so1 = new Numeral(10);
        Expression so2 = new Numeral(1);
        Expression so3 = new Numeral(2);
        Expression so4 = new Numeral(3);

        Square square = new Square(so1); //10^2
        Subtraction subtraction1 = new Subtraction(square,so2);// 10^2 -1
        Multiplication multiplication1 = new Multiplication(so3,so4);
        Addition addition1 = new Addition(subtraction1,multiplication1);
        Square square1 = new Square(addition1);
        double z = square1.evaluate();
        System.out.println(z);
    }
}
