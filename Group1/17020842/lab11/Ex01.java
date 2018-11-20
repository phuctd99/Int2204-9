/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

/**
 *
 * @author CACLV
 * @param <T>
 */
public class Ex01<T extends Comparable> {

    private T[] arr;

    public void setT(T[] t) {
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

    public void QuickSort(int low, int high) {
        if (low < high) {
            int p = partition(low, high);
            QuickSort(0, p - 1);
            QuickSort(p + 1, high);
        }
    }

    public void BubbleSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1].compareTo(arr[j]) >= 1) {
                    T temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void printA() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Ex01<Character> intArr = new Ex01<>();
        Character[] a = {'a', 'y', 'b'};
        intArr.setT(a);
        intArr.QuickSort(0, intArr.arr.length - 1);
        intArr.printA();

        Ex01<Integer> intArr1 = new Ex01<>();
        Integer[] a1 = {1, 5, 3, 2};
        intArr1.setT(a1);
        intArr1.BubbleSort();
        intArr1.printA();
    }
}
