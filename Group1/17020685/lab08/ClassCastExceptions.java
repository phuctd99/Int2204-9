/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2_tuan_8;

/**
 *
 * @author HP
 */
public class ClassCastExceptions {
    public static void Clas() throws ClassCastException{
        try {
            Object i = 50;
            String s = (String)i;
            System.out.println(s);
        } catch (ClassCastException e) {
            System.err.println("Ép kiểu không hợp lệ");
        }
    }
    
    public static void main(String[] args) {
        Clas();
    }
}
