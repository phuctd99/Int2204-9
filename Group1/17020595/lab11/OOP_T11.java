/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_t11;


public class OOP_T11<T extends Comparable> {
    private T[] arr;

    public void setKDL(T[] t) {
        this.arr = t;
    }

    public int partition(int low, int high) {
        T pivot = arr[high];
        int i = low;
        for (int j = low; j <= high; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                T temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        return i - 1;
    }
    public void QuickSort(int low, int high){
        if(low < high){
            int p = partition(low, high);
            QuickSort(0, p - 1);
            QuickSort(p+ 1, high);
        }
    }

    public void Print() {
        for (T ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        OOP_T11<String> StringArr = new OOP_T11<>();
//        String[] a = {"basd", "a", "baaa", "zad"};
//        StringArr.setKDL(a);
//        StringArr.QuickSort(0, StringArr.arr.length - 1);
//        StringArr.Print();
        OOP_T11<Double> doubleArr1  = new OOP_T11<>();
        Double[] a1 = {1.4, 1.2, 4.5, 0.6, 1.0};
        doubleArr1.setKDL(a1);
        doubleArr1.QuickSort(0, doubleArr1.arr.length -1);
        doubleArr1.Print();
        
    }

}
