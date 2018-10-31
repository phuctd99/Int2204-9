/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author CCNE
 */
public class ExpresstionTest {
    public static void main(String[] args) {
        Expression squareExpression = new Square(new Numeral(10));
        Expression subtractionExpression = new Subtraction(squareExpression, new Numeral(1));
        Expression multiplicationExpression = new Multiplication(new Numeral(2), new Numeral(3));
        Expression additionExpression = new Addition(subtractionExpression, multiplicationExpression);
        Expression squareExpression1 = new Square(additionExpression);
        System.out.println(squareExpression1);
        System.out.println(squareExpression1.evaluate());
        try {
            new Division(squareExpression, new Numeral(0)).evaluate();
        } catch (ArithmeticException e) {
            System.out.println("Lỗi chia cho 0");
        }
    }
}
