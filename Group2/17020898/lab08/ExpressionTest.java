import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.text.DecimalFormat;
import java.util.Stack;

public class ExpressionTest {

//    public static int add(int a, int b) {
//        return new Addition(new Numeral(a), new Numeral(b)).evaluate();
//    }
//
//    public static int sub(int a, int b) {
//        return new Subtraction(new Numeral(a), new Numeral(b)).evaluate();
//    }
//
//    public static int multi(int a, int b) {
//        return new Multiplication(new Numeral(a), new Numeral(b)).evaluate();
//    }
//
//     public static int div(int a, int b) {
//        return new Division(new Numeral(a), new Numeral(b)).evaluate();
//    }
//
//    public static int square(int a, int b) {
//        return new Square(new Numeral(a)).evaluate();
//    }
//
//    public static int calculate(int a, int b, char operator) {
//        if (operator == '+') {
//            return add(a, b);
//        } else if (operator == '-') {
//            return sub(a, b);
//        } else if (operator == '*') {
//            return multi(a, b);
//        } else if (operator == '/') {
//            return div(b, a);
//        } else if (operator == '^') {
//            return square(a, b);
//        }
//        return 0;
//    }
//
//    static boolean isSameOrGreaterOperator(char op1, char op2) {
//        if (op1 == '^') {
//            return true;
//        } else if (op2 == '^') {
//            return false;
//        } else if (op1 == '*' || op1 == '/') {
//            return true;
//        } else if (op2 == '*' || op2 == '/') {
//            return false;
//        }
//        return true;
//    }
//
//    static int evaluateBinaryExpression(String exp) {
//        Stack<Character> operators = new Stack<>();
//        Stack<Integer> values = new Stack<>();
//        for (int i = 0; i < exp.length(); i++) {
//            char c = exp.charAt(i);
//            if (c == '(') {
//                operators.push(c);
//            } else if (c == ')') {
//                while (operators.peek() != '(' && values.size() > 1) {
//                    char op = operators.pop();
//                    int a = values.pop();
//                    int b = values.pop();
//                    values.push(calculate(a, b, op));
//                }
//                for (int j = operators.size() - 1; j >= 0; j--) {
//                    if (operators.get(j) == '(') {
//                        operators.pop();
//                        break;
//                    }
//                }
//            } else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
//                while (operators.isEmpty() == false && isSameOrGreaterOperator(operators.peek(), c) && values.size() > 1) {
//                    char op = operators.pop();
//                    int a = values.pop();
//                    int b = values.pop();
//                    values.push(calculate(a, b, op));
//                }
//                operators.push(c);
//            } else {
//                values.push(Integer.parseInt(Character.toString(c)));
//                while (exp.charAt(i + 1) >= '0' && exp.charAt(i + 1) <= '9') {
//                    values.push(values.pop() * 10 + Integer.parseInt(Character.toString(exp.charAt(i + 1))));
//                    i++;
//                }
//            }
//        }
//        return values.pop();
//
//    }



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
        System.out.println(result);

        /// Test divide by zero
        try {
            int ex = new Division(new Numeral(5), new Numeral(0)).evaluate();
        } catch (ArithmeticException e) {
            System.out.println("Lỗi chia cho 0.");
        }
    }

}
