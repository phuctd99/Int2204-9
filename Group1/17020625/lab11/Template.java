/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

/**
 *
 * @author CCNE
 * 
 * 
 */
import java.util.Scanner;

public class Template < E >{

    /**
     * @param primate
     * @param args the command line arguments
     */
    static < E >void swap(E[] a, int i , int j) {
        E tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
   
    }
    
    /**
     *
     * @param primate
     */
     public static <E extends Comparable<E>> void sortArray(E[] primate) {
        
         
         int n = primate.length;
         for(int i = 0 ; i < n - 1 ;i++) {
             for(int j = 0; j < n - 1 - i; j++) {
                 if(primate[j].compareTo(primate[j+1]) > 0) {
                     swap(primate, j, j + 1);
                 }
            }
         }
         for(int i = 0 ; i < n; i ++) {
             System.out.print(primate[i] + " ");
         
         }
         
         System.err.println("");
         
      }
    
        
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       // Integer[] intput =  {2, 3, 1, 34, 5 , 3, 2 ,1, 6, 2,6,7};
        Float[] floatput = new Float[5];
//        for(int i = 0 ; i < floatput.length ; i++) {
//           floatput[i] = sc.nextFloat();
//        }
//         sortArray(floatput);
//         
         Double[] doubleput = { 2.3 , 1.2 , 1.5 };
         sortArray(doubleput);
        
        
    }
    
}
