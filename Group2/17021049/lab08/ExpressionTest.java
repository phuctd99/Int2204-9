package bai1;

public class ExpressionTest {


    public static void main(String[] args) {
        Expression ex1 = new Numeral(10);
        Expression ex2 = new Numeral(-1);
        Expression ex3 = new Numeral(2*3);
        Expression ex4 = new Addition(new Addition(new Square(ex1), ex2), ex3);
        Expression ex5 = new Square(ex4);
        int result = ex5.evaluate();
        System.out.println(result);

        Expression num1 = new Numeral(5);
        Expression num2 = new Numeral(0);
        try {
            Division div = new Division(num1,num2);
            int num = div.evaluate();
            System.out.println(num);
        }
        catch (Exception e) {
            System.out.println("Loi chia cho 0");
        }
    }

}
