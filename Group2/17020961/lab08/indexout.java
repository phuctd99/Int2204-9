/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author CCNE
 */
public class indexout {
    public static void printElement() throws ArrayIndexOutOfBoundsException{
        int[] arr = new int[5];
        System.out.println(arr[5]);
    }
    public static void main(String [] args){
        try{
            printElement();
        }catch(Exception e){
            System.out.println("Ngoại lệ :"+e);
        }
    }
}
