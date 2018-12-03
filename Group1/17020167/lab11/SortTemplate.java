/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author Admin
 */
public class SortTemplate {

    
    public <T> void swap(T[] a, int i, int j) {
        if (i != j) {
            T temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public <T extends Comparable<T>> void selectionSort(T[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[smallest])<=0) {
                    smallest = j;
                }
            }

            swap(a, i, smallest);  
        }
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        SortTemplate sr = new SortTemplate();
        Integer[] integ = new Integer[5];
       
        Character[] cha = new Character[5];
        for(int i = 0; i < 5; i++){
            integ[i] = 12 - i;
            
            cha[i] = (char)(105 - i);
        }
        sr.selectionSort(integ);
        sr.selectionSort(cha);
       
    }
    
}
