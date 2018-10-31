package bttuan8;


public class ExpressionTest {

    public static void main(String[] args) {
        // Test (10^2 - 1 + 2*3)^2

        //10^2
        Expression ex1 = new Square(new Numeral(10));

        //2*3
        Expression ex2 = new Multiplication(new Numeral(2), new Numeral(3));

        //10^2 - 1
        Expression ex3 = new Subtraction(ex1, new Numeral(1));

        //10^2 - 1 + 2*3
        Expression ex4 = new Addition(ex3, ex2);

        //(10^2 - 1 + 2*3)^2
        Expression ex5 = new Square(ex4);
        System.out.println(ex5.toString() + " = " + ex5.evaluate());


        /// Test divide by zero
        try {
            int ex = new Division(new Numeral(5), new Numeral(0)).evaluate();
        } catch (ArithmeticException e) {
            System.out.println("Lỗi chia cho 0.");
        }
    }

}