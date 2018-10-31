/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_08;

/*
 *
 * @author admin
 */
public class Expression_Test {
    Expression_Test t = new Expression_Test();

    public static void main(String[] args) {
        Expression eq = new Square(new Numeral(10));
        Expression sub = new Subtraction(eq, new Numeral(1));
        Expression mul = new Multiplication(new Numeral(2), new Numeral(3));
        Expression add = new Addition(sub, mul);
        Expression sq = new Square(add);

        System.out.println(sub.evalute());
        
        try {
            Division di = new Division(new Numeral(10), new Numeral(0));
            System.out.println(di.evalute());
        } catch (ArithmeticException e) {
            System.out.println("so chia bang 0");
        }
        
        System.out.println(sq.toString());
        
      
        
        
        
            
        
        
        
    }
    
}
