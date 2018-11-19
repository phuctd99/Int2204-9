
package bai2;

import java.util.Random;
public class Max {
    
    public static <T extends Comparable> T max(T[] a)
    {
        if( a== null || a.length ==0 ) return null;
        T smallest = a[0];
        for (int i = 1; i < a.length; i++)
        if (smallest.compareTo(a[i]) < 0)
        smallest = a[i];
        return smallest; 
        
    }
    
    public static void main(String[] args) {
        
        Max m = new Max();
        Random rd = new Random();
        Double[] d = new Double[10];
        for(int i=0;i<10;i++) {
            double num1 = rd.nextDouble();
            d[i] = num1; 
        }
        for(int i=0 ; i<10 ; i++) {
            
            System.out.println(d[i] + " ");
        }
        System.out.println(" max:   "+ max(d));
       
    }
}
