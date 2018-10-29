/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author CCNE
 */
public class ArrayIndex {
    public static void take(int[] a, int i) throws ArrayIndexOutOfBoundsException{
        try 
        {
            System.out.println(a[i]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.getMessage();
        }
            
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i =0; i < n; i++)
        {
            a[i] = scan.nextInt();
        }
        take(a, 100);
    }
    
}
