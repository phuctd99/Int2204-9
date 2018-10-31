/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author Tommmm^^
 */
public class BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Expression ex = new Numeral(10);
        Expression ex1 = new Square(ex);
        Subtraction ex2 = new Subtraction(ex1, new Numeral(1));
        Multiplication ex10 = new Multiplication(new Numeral(2), new Numeral(3));
        Expression ex3 = new Addition(ex2,ex10 );
        Expression ex4 = new Square(ex3);
        System.out.println(ex4.evaluate());
        try {
            System.out.println(new Division(new Numeral(3) , new Numeral(0)).evaluate());
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }
   }
    

