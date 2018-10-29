/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author CCNE
 */
public class classcast {
    public static void epkieu() throws ClassCastException{
        try {
            Object i = 50;
            String s = (String)i;
        }
        catch (ClassCastException e){
            System.out.println("Can't");
        }
    }
    public static void main(String[] args) {
        epkieu();
    }
    
}
