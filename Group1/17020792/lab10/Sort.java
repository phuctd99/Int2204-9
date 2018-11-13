/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.ArrayList;
import java.util.Random;


public class Sort {
    
     public static void sort(Double[] a) {
        int n = a.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = n -1 ; j > i; j--) {
                if(a[i] > a[j]) {
                    Double x = a[i];
		    a[i] = a[j];
		    a[j] = x;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Double[] a = new Double[1000];
        Random rd = new Random();
        for(int i = 0; i < 1000; i++) {
            a[i] = rd.nextDouble() * 200;
        }
        sort(a);
        for(int  i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
