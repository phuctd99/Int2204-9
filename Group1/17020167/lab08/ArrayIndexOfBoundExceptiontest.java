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
public class ArrayIndexOfBoundExceptiontest {

    public void getarr3(int[] a) throws ArrayIndexOutOfBoundsException{
        try {
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        
    }
    public static void main(String[] args) {
        ArrayIndexOfBoundExceptiontest newt = new ArrayIndexOfBoundExceptiontest();
        int []a = {1,2,3};
        newt.getarr3(a);
    }
    
}
