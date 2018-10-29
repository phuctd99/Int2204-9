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
//ngoai le ep kieu
public class classcast {
    public static void printObject() throws ClassCastException{
        Object x = Integer.valueOf(10);
        System.out.println((String)x);
    }
    public static void main(String[] args){
        try{
            printObject();
        }catch(Exception e){
            System.out.println("Ngoai le:"+e);
        }
    }
}
