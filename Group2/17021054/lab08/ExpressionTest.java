import java.util.*;
public class ExpressionTest {

    public static int add(int a, int b) {
        return new Addition(new Numeral(a), new Numeral(b)).getValue();
    }

    public static int sub(int a, int b) {
        return new Subtraction(new Numeral(a), new Numeral(b)).getValue();
    }

    public static int multi(int a, int b) {
        return new Multiplication(new Numeral(a), new Numeral(b)).getValue();
    }

    public static int div(int a, int b) {
        return new Division(new Numeral(a), new Numeral(b)).getValue();
    }

    public static int square(int a, int b) {
        return new Square(new Numeral(a)).getValue();
    }

    public static void main(String[] args) {
        // Test (10^2 - 1 + 2*3)^2

        //10^2
        int ex1 = new Square(new Numeral(10)).getValue();

        //2*3
        int ex2 = new Multiplication(new Numeral(2), new Numeral(3)).getValue();

        //10^2 - 1
        int ex3 = new Subtraction(new Numeral(ex1), new Numeral(1)).getValue();

        //10^2 - 1 + 2*3
        int ex4 = new Addition(new Numeral(ex3), new Numeral(ex2)).getValue();

        //(10^2 - 1 + 2*3)^2
        int result = new Square(new Numeral(ex4)).getValue();
        System.out.println(result);

        // chia cho 0
        try {
            int ex = new Division(new Numeral(3),new Numeral(0)).getValue();
        } catch (java.lang.ArithmeticException e){
            System.out.println("Lỗi chia cho 0!");
        }

    }
}
