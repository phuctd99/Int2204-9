package task1;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression ex1 = new Square(new Numeral(10));

        Expression ex2 = new Subtraction(ex1, new Numeral(1));

        Expression ex3 = new Multiplication(new Numeral(2), new Numeral(3));

        Expression ex4 = new Addition(ex2, ex3);

        Expression ex5 = new Square(ex4);

        System.out.println( ex5.toString() + " = " + ex5.evaluate());

        Expression ex6 = new Divison(ex5, new Numeral(0));
        try {
            //ex6.evaluate();
            System.out.println(ex6.toString() + " = " + ex6.evaluate());
        } catch (ArithmeticException ex) {
            System.out.println("Error!!!");
            System.out.println("Divided by 0");
        }
    }
}
