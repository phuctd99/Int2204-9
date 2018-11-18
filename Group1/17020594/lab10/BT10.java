/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt10;

import java.util.Random;

/**
 *
 * @author Tommmm^^
 */
public class BT10 {

    
    public static void main(String[] args) {
      
       double [] a = new double [1000];
       Random rd = new Random();
       for(int i = 0 ; i < 1000 ; i++) {
           a[i] = rd.nextDouble();
       }
       sapXep(a);
               
      
    }
    public static void sapXep(double a[] ) {
         double temp;
         for (int i = 0; i < 999; i++) {
        for (int j = 999; j >= 1; j--) {
            
            if (a[j] < a[j - 1]) {
                temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
        }
    }
        System.out.println("\nMảng sau khi sắp xếp: ");
    for (int i = 0; i < 1000; i++) {
        System.out.print(a[i] + "\t");
    }
        
    }
    
    
}
