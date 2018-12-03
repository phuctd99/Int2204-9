/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;
public class bubble_sort implements Strategy{

    @Override
    public void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                int trungian = 0;
                if(arr[i] > arr[j]){
                    trungian = arr[j];
                    arr[j] = arr[i];
                    arr[i] = trungian;
                }
            }
        }
        for(int i = 0; i< arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
