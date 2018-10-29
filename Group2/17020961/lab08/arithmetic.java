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
public class arithmetic {
    public static void print() throws ArithmeticException{
        System.out.println(50/0);
    }
    public static void main(String [] args){
        try{
            print();
        }catch(Exception e){
            System.out.println("Ngoai le:"+e);
        }
    }
}