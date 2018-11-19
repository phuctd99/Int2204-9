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
public class SortData {
    private <T> void swap(T[] arr, int i, int j) {
        if (i != j) {
            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    public <T extends Comparable<T>> void Sort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[smallest]) < 0) {
                    smallest = j;
                }
            }

            swap(arr, i, smallest);
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args) {
        SortData sd = new SortData();
        Integer[] it = new Integer[10];
        Double[] d = new Double[10];
        Character[] c = new Character[10];
        Random rd = new Random();
        for(int i = 0; i < 10; i++){
            it[i] = rd.nextInt();
            d[i] = rd.nextDouble();
            c[i] = (char)(105 - i);
        }
        sd.Sort(it);
        sd.Sort(c);
        sd.Sort(d);

    }

}
