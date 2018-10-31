public class ExpressionTest {

    public static void main(String[] args) {
        //ex1 = 10^2
        Expression ex1 = new Square(new Numeral(10));

        //ex2 = 10^2 - 1
        Expression ex2 = new Subtraction(ex1, new Numeral(1));

        //ex3 = 2*3
        Expression ex3 = new Multiplication(new Numeral(2), new Numeral(3));

        //ex4 = 10^2 - 1 + 2*3
        Expression ex4 = new Addition(ex2, ex3);

        //ex5 = (10^2 - 1 + 2*3)^2
        Expression ex5 = new Square(ex4);

        //value of ex5
        int value = ex5.evaluate();
        System.out.println(value);
        System.out.println(ex5.toString());


        Expression ex = new Division(new Numeral(10), new Numeral(0));
        //lỗi chia cho 0
        try {
            int n = ex.evaluate();
            System.out.println(n);
        } catch (ArithmeticException e) {
            System.out.print("Lỗi chia cho 0: " + ex.toString());
        }
    }
}