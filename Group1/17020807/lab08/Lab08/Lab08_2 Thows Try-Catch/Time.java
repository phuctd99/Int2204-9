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
public class Time {
    public static void division(int a, int b) throws ArithmeticException{
        try{
            System.out.println(a/b);;
        }
        catch(ArithmeticException e){
            System.out.println("Loi chia 0");
            
        }
    }
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        division(a,b);
    }
}
