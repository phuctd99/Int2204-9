/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan11;

import java.util.ArrayList;

/**
 *
 * @author CCNE
 */
public class tuan11_2 {
    public static <T extends Comparable> T max(ArrayList<T> arr){
        T maximum = arr.get(0);
        for(int i =1; i< arr.size(); i++){
            if(arr.get(i).compareTo(maximum)>0){
                maximum = arr.get(i);
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(34);
        list.add(22);
        list.add(12);
        list.add(45);
        System.out.println(max(list));
    }
    
}
