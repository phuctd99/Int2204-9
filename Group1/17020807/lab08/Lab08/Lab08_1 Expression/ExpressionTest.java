/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expression;

/**
 *
 * @author Dell
 */
public class ExpressionTest {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Expression  num = new Numeral(10);
        Expression  num1 = new Numeral(1);
        
        System.out.println(num.toString() + " = " + num.evaluate());
        Expression Square = new Square(num);
        
        Expression add = new Addition(num, Square);
        Expression sub = new Sub(Square, num1);
        Expression mul = new Multiplication(new Numeral(2), new Numeral(3));
        Expression add1 = new Addition(sub, mul);
        Expression Square1 = new Square(add1);
        System.out.println(Square1.toString() + " = " + Square1.evaluate());
        try{
            Expression div = new Division(new Numeral(2), new Numeral(0));
            System.out.println(div.toString() + " = " + div.evaluate());
        }
        catch(ArithmeticException e){
            System.out.println("Chia cho 0");
        }
        
    }
    
}
