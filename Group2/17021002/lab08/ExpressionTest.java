/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap09;

/**
 *
 * @author VIETTEL
 */
public class ExpressionTest {
      public static void main(String[] args, int value) {
        Expression n = new Numeral(10);
        
        Expression n1 = new Square(n);
        Expression square = new Numeral(n1.evaluate());
        
        Expression n2 = new Numeral(2);
        Expression n3 = new Numeral(3);
        
        Expression n4 = new Multiplication(n2, n3);
        Expression multi = new Numeral(n4.evaluate());
        
        Expression n5 = new Addition(square, multi);
        
        
        
    }

 
    
}

