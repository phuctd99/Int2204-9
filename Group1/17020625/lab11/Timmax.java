/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timmax;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author CCNE
 */
public class Timmax<E>{

    /**
     * @param args the command line arguments
     */
    public static <T extends Comparable> T max (ArrayList<T> arr) {
        T max = arr.get(0);
        for(int i = 1 ;i < arr.size() ; i++) {
            if(max.compareTo(arr.get(i)) < 0) max = arr.get(i);
        }
        
            return max;
      }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(193);
        System.out.print(max(arr));
    
    }
    
}
