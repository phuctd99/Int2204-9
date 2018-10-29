package oop_t8;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression fx = new Square(new Addition(newAddition(new Square(Mu), -1) ), new Multiplication(new Square(2), 2)) ;
        System.out.println(fx.evaluate());
    }
}
