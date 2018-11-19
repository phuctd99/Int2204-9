/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan11;

/**
 *
 * @author CCNE
 */
public class Tuan11 {
    public <T> void swap(T[] a, int i, int j){
        if(i != j){
            T tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
    }
    public  <T extends Comparable<T>> void sapxep(T[] a){
        int n =a.length;
        
        for(int i = 0; i<n - 1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(a[j].compareTo(a[min])<=0){
                    min = j;
                }
            }
            swap(a, i, min);
        }
        for(int i = 0 ; i < n; i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        Tuan11 x = new Tuan11();
        Integer[] I = {1,8,3,6,5,4};
        Double[] F = {1.3,5.7,9.3,4.2,2.5};
        Character[] C = new Character[6];
        for(int i = 0; i < 6; i++){
            C[i] = (char)(100-i);
        }
        x.sapxep(I);
        x.sapxep(F);
        x.sapxep(C);
    }
    
}
