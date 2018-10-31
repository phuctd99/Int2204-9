/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab08;
import java.lang.ArithmeticException;
import java.util.*;

/**
 *
 * @author Admin
 */
public class ExpressionTest {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Expression expression1 = new Numeral(scan.nextInt());
        Expression expression2 = new Numeral(scan.nextInt());
        
        BinaryExpression binExpAdd = new Addition(expression1, expression2);
        System.out.println(binExpAdd.toString() + " = " + binExpAdd.evaluate());
        
        BinaryExpression binExpSub = new Subtraction(expression1, expression2);
        System.out.println(binExpSub.toString() + " = " + binExpSub.evaluate());
        
        BinaryExpression binExpMul = new Multiplication(expression1, expression2);
        System.out.println(binExpMul.toString() + " = " + binExpMul.evaluate());
        
        try{
            BinaryExpression binExpDiv = new Division(expression1, expression2);
            System.out.println(binExpDiv.toString() + " = " + binExpDiv.evaluate());
        }
        catch (ArithmeticException e) {
            System.out.println("Chia cho 0");
        }
        
        
        Expression exp = new Square(expression1);
        System.out.println(exp.toString() + " = " + exp.evaluate());
                
    }
}
