/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class cau1 {

    public static <T extends Comparable> void sort(T[] arr){
        for(int i =0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i].compareTo(arr[j]) > 0){
                    T trunggian = arr[i];
                    arr[i] = arr[j];
                    arr[j] = trunggian;
                    
                }
            }
        }
    }
    public static void main(String[] args) {
        Integer[] a = {1,5,2,3,8,6};
        sort(a);
        for(int i = 0; i< a.length; i++){
            System.out.println(a[i]+" ");
        }
        String[] b = {"tran","van","khai"};
        sort(b);
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]+" ");
        }
    }
    
}
