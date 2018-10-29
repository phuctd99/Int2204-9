/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap08;

import java.util.Scanner;
import java.lang.ArithmeticException;
/**
 *
 * @author Hoang Vu Huong
 */
public class ExpressionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try{
         Expression nhan = new Square(new Numeral(10) );
         Expression nhan1 = new Multiplication(new Numeral(2), new Numeral(3));
         Expression tru = new Subtraction(nhan, nhan1);
         Expression kq = new Square(tru);
                 
         System.out.println(kq.toString()+"\n" + kq.evaluate());
         }catch(ArithmeticException e){
             System.err.println("Ban Vua chia cho so 0");
         }
                 
    }
    
}
