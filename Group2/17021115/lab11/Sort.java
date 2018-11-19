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
public class Sort {

    public <E extends Comparable<E>> void sortArray(E[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            E temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        Sort test = new Sort();
        
        Integer[] arrInt = {1, 5, 2, 6, 4, 3};
        test.sortArray(arrInt);
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i] + " ");
        }
        System.out.println();
        Character[] arrChar = {'e', 'x', 'a', 'm', 'p', 'l', 'e'};
        test.sortArray(arrChar);
        for (int i = 0; i < arrChar.length; i++) {
            System.out.print(arrChar[i] + " ");
        }
    }
}
