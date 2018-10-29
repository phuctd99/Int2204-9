/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baituan8;

/**
 *
 * @author pc
 */
public class ExpressionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Expression num1 = new Numeral(3);//= 3
        Expression s1 = new Square(num1);//= 3^2
        Expression num2 = new Numeral(1);//= 1
        Expression add = new Addition(s1, num2);// = 3^2 + 1
        Expression s2 = new Square(add);// =(3^2 + 1)^2
        Expression num3 = new Numeral(0);
        System.out.println(s2.evaluate());
        try{
            Expression div = new Division(num1, num3);
            System.out.println(div.evaluate());
        } catch(ArithmeticException e){
            System.out.println("loi chia cho 0");
        }
    }
    
}
