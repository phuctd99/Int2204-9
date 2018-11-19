/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CCNE
 */
public class BT11 {

    public static <E extends Comparable > E max(ArrayList<E> arr) {
        E max = arr.get(0);
        for(int i = 1 ; i < arr.size() ; i++) {
            if(arr.get(i).compareTo(max) > 0) max = arr.get(i);
        }
        return max;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(max(list));
        
      
    }
}
    

