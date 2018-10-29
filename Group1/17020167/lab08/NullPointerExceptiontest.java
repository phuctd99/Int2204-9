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
public class NullPointerExceptiontest {
    public void equalstring(String s) throws NullPointerException{
        try {
            if(s.equals("hello"))
        {
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
        
    }
    public static void main (String[] args) 
    { 
           NullPointerExceptiontest newt = new NullPointerExceptiontest();
           String s = null;
           newt.equalstring(s);
    } 
    
}
