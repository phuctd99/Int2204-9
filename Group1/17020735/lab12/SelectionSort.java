/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author CCNE
 */
public class SelectionSort implements Strategy {

    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i]; 
            int index = i; 
            for (int j = i + 1; j < arr.length; j++) {
                if(max < arr[j]){
                    max = arr[j];
                    index = j;
                }
            }
            
            if(index != i){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }
}
