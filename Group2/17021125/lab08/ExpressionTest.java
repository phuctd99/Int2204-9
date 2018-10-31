import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.text.DecimalFormat;
import java.util.Stack;

public class ExpressionTest {

    public static void main(String[] args) {
        // Test (10^2 - 1 + 2*3)^2

        //10^2
        int ex1 = new Square(new Numeral(10)).evaluate();

        //2*3
        int ex2 = new Multiplication(new Numeral(2), new Numeral(3)).evaluate();

        //10^2 - 1
        int ex3 = new Subtraction(new Numeral(ex1), new Numeral(1)).evaluate();

        //10^2 - 1 + 2*3
        int ex4 = new Addition(new Numeral(ex3), new Numeral(ex2)).evaluate();

        //(10^2 - 1 + 2*3)^2
        int result = new Square(new Numeral(ex4)).evaluate();
        System.out.println("(10^2 - 1 + 2*3)^2 = " + result);

        /// Test divide by zero
        try {
            int ex = new Division(new Numeral(5), new Numeral(0)).evaluate();
        } catch (ArithmeticException e) {
            System.out.println("Loi chia cho 0!");
        }
    }

}
