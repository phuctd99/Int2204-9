package Lab081;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression num10 = new Numeral(10);
        Expression num2 = new Numeral(2);
        Expression num1 = new Numeral(1);
        Expression num3 = new Numeral(3);
        Expression num0 = new Numeral(0);

        Expression rs1 = new Square(num10); // Tính 10^2
        Expression rs2 = new Subtraction(rs1,num1); // Tính 10^2 -1
        Expression rs3 = new Square(num2);// Tính 2^2
        Expression rs5 = new Multiplication(num2,rs3); // TÍnh 2^3;
        Expression rs4 = new Addition(rs2,rs5);// Tính (10^2 - 1 + 2^3)

        Expression rs = new Square(rs4);// tính KQ

        System.out.println(rs.toString()+ " = " +rs.evaluate()); // In KQ

        // Xử lý chia 0

        try{
            Expression a = new Division(num10, num0);

            System.out.println(a.toString() + " = " + a.evaluate());
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
