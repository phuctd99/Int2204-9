/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

/**
 *
 * @author admin
 */
public class selection_sort implements Strategy{

    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        } 
        for(int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }  
    }
