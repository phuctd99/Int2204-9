/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author Admin
 */
public class ExpressionTest {
    public static void main(String[] args) {
        Expression ex1 = new Numeral(10);
        Expression ex2 = new Numeral(-1);
        Expression ex3 = new Numeral(2*3);
        Expression ex4 = new Addtion(new Addtion(new Square(ex1), ex2), ex3);
        Expression ex5 = new Square(ex4);
        System.out.println(ex5.evaluate());
        Expression ex6 = new Division(new Numeral(10), new Numeral(0));
        System.out.println(ex6.evaluate());
    }
}
