/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.ArrayList;

/**
 *
 * @author CCNE
 */
public class FindMaxArray {
    public <E extends Comparable<E>> E findMaxArray(ArrayList<E> arr) {
        E max = arr.get(0);
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i).compareTo(max) > 0){
                max = arr.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        FindMaxArray test = new FindMaxArray();
        
        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(5);
        arrInt.add(1);
        arrInt.add(4);
        arrInt.add(2);
        arrInt.add(3);
        System.out.println(test.findMaxArray(arrInt));
    }
}
