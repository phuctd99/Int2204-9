/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan_8;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class ExpressionTest {
    public static void main(String args[]) throws NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, ClassCastException, IOException, FileNotFoundException{
 
        Expression n1 = new Numeral(3); //3
        Expression n2 = new Numeral(0); //0
        Expression s1 = new Square(n1); //3^2
        
        Expression d1 = new Division(n2, s1);// 3/0
        Expression a1 = new Addition(s1, n2); //3^2 + 1
        Expression s2 = new Square(a1); // (3^2 + 1)^2
        
        System.out.println(n1.toString());
        System.out.println("Square: "+s1.toString());
        System.out.println(n2);
        System.out.println(a1.evaluate());
        System.out.println("Square: "+s2.toString());
        System.out.println(s2.evaluate());
        System.out.println(d1);
        try {
            int value = d1.evaluate();
            System.out.println(d1.evaluate());
        } catch(ArithmeticException e) {
            System.out.println("Lỗi chia cho 0");
        }
    }

}
