/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author CCNE
 */
public class Nullpointer {
    public static void hashCode(String a) throws NullPointerException{
    if (a.length() == 0)
        System.out.println("String is empty");
    else System.out.println(a.hashCode());
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "bgj";
        hashCode(a);
// TODO code application logic here
    }
    
}
