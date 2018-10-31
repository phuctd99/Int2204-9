/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08bai2;

/**
 *
 * @author hieu
 */
public class Array {
    public static void print() throws ArrayIndexOutOfBoundsException{
        int [] arr = {1,3,4};
        System.out.println(arr[5]);
    }
    public static void main(String[] args) {
        try{
            print();
    } catch(Exception e){
            System.out.println("loi ArrayIndexOutOfBoundsException");
    }
//        print();
   }
}
