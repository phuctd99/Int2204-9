/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

/**
 *
 * @author Hoang Vu Huong
 */
public class ClassCastExceptions {
    public static String In(Object a) throws ClassCastException{
        return (String )a;
   }
    public static void main(String[] args) {
        Integer a;
        try{
            System.out.println(In(55));
        }catch(ClassCastException w){
            System.err.println("Khong the chuyen doi");
    }
}
}
