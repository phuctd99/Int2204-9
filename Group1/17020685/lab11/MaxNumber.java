/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan_11;
import java.util.Random;
/**
 *
 * @author CCNE
 */
public class MaxNumber {
    public static <A extends Comparable> A Max(A[] ar) {
        if (ar == null || ar.length == 0) return null;
        A biggest = ar[0];
        for (int i = 1; i < ar.length; i++)
        if (biggest.compareTo(ar[i]) < 0)
        biggest = ar[i];
        return biggest; 
    }
    
    public static void main(String[] args) {
        MaxNumber mn = new MaxNumber();
        Double[] arr = new Double[10];
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = rd.nextDouble();
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("MAX: " + Max(arr));
        
    }
}
