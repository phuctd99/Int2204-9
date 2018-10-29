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
public class ClassCastExceptiontest {

    public void dosomething() throws ClassCastException{
        try{
            Object i = 42;
            String s = (String)i;  
        }
        catch(ClassCastException e)
        {
            System.out.println("ClassCastException");
        }
    }
    public static void main(String[] args) {
        ClassCastExceptiontest newt = new ClassCastExceptiontest();
        newt.dosomething();
    }
    
}
