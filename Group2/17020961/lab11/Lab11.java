/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;
import java.util.*;
import static javafx.scene.input.KeyCode.T;
import lab11.PS;
public class Lab11 {

    private static <T> void swap(T[] a, int i, int j) {
        if (i != j) {
            T temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public static <T extends Comparable<T>> void Sort(T[] a) {
        for (int i = 0; i < a.length ; i++) {   
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareTo(a[j])>0) {
                    swap(a, i, j);
                }
            }
        }
    }
    
    public static void main(String[] args){
        
        PS[] arrPS = new PS[4];
        arrPS[0] = new PS(4,5);
        arrPS[1] = new PS(3,5);
        arrPS[2] = new PS(3,7);
        arrPS[3] = new PS(6,5);
        Sort(arrPS);
        System.out.println("After sort PS : ");
        for(int i=0;i <arrPS.length;i++){
            System.out.print(arrPS[i].getTuso()+"/"+arrPS[i].getMauso()+" ");
        }
        System.out.println();
        Integer[] arr = {3,4,1,5};
        Sort(arr);
        System.out.println("After sort int : "+Arrays.toString(arr));
        String[] arr1= {"acd","ded","dal","bad","cle"};
        Sort(arr1);
        System.out.println("After sort String : "+Arrays.toString(arr1));
        Character[] arr2= {'c','e','a','d','c'};
        Sort(arr2);
        System.out.println("After sort char : "+Arrays.toString(arr2));
    }
}
