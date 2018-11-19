/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author CCNE
 */
import java.util.Random;
import static lab11.Max.max;
public class Max {
    
    public static <Tdsfsdgfdsg extends Comparable> Tdsfsdgfdsg max(Tdsfsdgfdsg[] a)
    {
        Tdsfsdgfdsg min = a[0];
        for (int i = 1; i < a.length; i++)
        {
            if (min.compareTo(a[i]) < 0)
                 min = a[i];
        }
        
        return min; 
        
    }
    
    public static void main(String[] args) {
         Double[] a = {1.1,8.9,2.4,5.6,7.3};
        System.out.println(" max: "+ max(a));
    }
}
