/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author hieu
 */
public class ExpressionTest {
    public static void main(String[] args) {
        Expression square = new Square(new Numeral(10));
        Expression su = new Subtracion(square, new Numeral(1));
        Expression mu = new Multiplication(new Numeral(2), new Numeral(3));
        Expression add = new Addition(su, mu);
        Expression sq = new Square (add);
        System.out.println(sq.toString());
        System.out.println(sq.evaluate());
    }
    
}
