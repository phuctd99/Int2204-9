/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopw8;
import java.lang.ArithmeticException;
/**
 *
 * @author nguyenhuy
 */
public class Expression_Test {
    public static void main(String[] args) {
        Expression ex = new Numeral(10);
        Expression ex1 = new Square(ex);
        Expression ex2 = new Subtraction(ex1, new Numeral(1));
        Expression ex3 = new Addition(ex2, new Multiplication(new Numeral(2), new Numeral(3)));
        Expression ex4 = new Square(ex3);
        System.out.println(ex4.evaluate());
        try {
            System.out.println(new Division(new Numeral(3) , new Numeral(0)).evaluate());
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
