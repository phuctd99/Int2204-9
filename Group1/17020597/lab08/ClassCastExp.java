/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab08;

/**
 *
 * @author Admin
 */
public class ClassCastExp {
    public static void method(int index) throws ClassCastException {
        try {
            Object sObject = index;
            String str = (String) sObject;
            System.out.println(str);
        }
        catch(ClassCastException e) {
            System.out.println("Không thể ép kiểu");
        }
    }
    public static void main(String[] args) {
        method(60);
    }
}
