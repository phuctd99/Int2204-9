/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author Admin
 */
public class ArithmeticExceptiontest {

    public void divdie(int a, int b) throws ArithmeticException{
        try{
            int e = a/b;
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
    }
    public static void main(String[] args) {
        ArithmeticExceptiontest newt = new ArithmeticExceptiontest();
        newt.divdie(2, 0);
    }
    
}
