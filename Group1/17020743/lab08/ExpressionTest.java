/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author CCNE
 */
public class ExpressionTest {
     public static void main(String args[]) {
        Expression n1 = new Numeral(10); //10
        Expression s1 = new Square(n1); //10^2
        Expression n0 = new Numeral(1); //1
        Expression s0 = new Subtraction(s1 , n0) ; // 10^2 - 1
        Expression n2 = new Numeral(2); //2
        Expression n3 = new Numeral(3) ; //3
        Expression s2 = new Multiplication(n2, n3);
        Expression a1 = new Addition(s0, s2); //10^2 - 1 + 2*3
        Expression s3 = new Square(a1); // (10^2 - 1 + 2*3)^2
        Expression s4 = new Numeral(0) ;
        try {
            Expression s5 = new Division(n1, s4);
            System.out.println(s5.evaluate());
            
        } catch (ArithmeticException e) {
            System.out.println("Loi chia cho 0");
        } 
        System.out.println(s3.evaluate());

     }
    
}
