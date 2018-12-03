/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan_12;

/**
 *
 * @author HP
 */
interface SortAlgorithm{
    void sort(int[] arr, int left, int right);
}

class BubbleSort implements SortAlgorithm{
    @Override
    public void sort(int[] arr, int left, int right){
        System.out.println("--Bubble Sort--");
        int  temp;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0;j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements SortAlgorithm{
    @Override
    public void sort(int[] arr, int left, int right){
        System.out.println("--Selection Sort--");
        for(int i = 0; i < arr.length; i++){
            int minArr = i;
            int temp = arr[i];
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < temp) {
                    temp = arr[j];
                    minArr = j;
                }
            }
            arr[minArr] = arr[i];
            arr[i] = temp;
        }
    }
}

class QuickSort implements SortAlgorithm {
    @Override
    public void sort(int[] arr, int left, int right) {
        if (left <= right) {
            int key = arr[(left+right)/2];
 
            int i = left;
            int j = right;
            while (i <= j) {
                while (arr[i] < key) {
                    i++;
                }
		while (arr[j] > key) {
                    j--;
                }
 		if (i <= j) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i++;
                    j--;
		}
            }
            if (left < j) {
		sort(arr, left, j);
            }
            if (right > i) {
		sort(arr, i, right);
            }
	}
        
    }
}
public class Strategy {
    private SortAlgorithm sortAlgorithm;
    public void setSortAlgorithm(SortAlgorithm S){
        sortAlgorithm = S;
    }

    public static void main(String[] args){
        int[] a = {7, 2, 3, 6, 2, 7, 9, 8, 10, 1, 5};
        Strategy s = new Strategy();
        
        s.setSortAlgorithm(new BubbleSort());
        s.sortAlgorithm.sort(a, 0 , 10);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
        s.setSortAlgorithm(new SelectionSort());
        s.sortAlgorithm.sort(a, 0, 10);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        System.out.println("--Quick Sort--");
        s.setSortAlgorithm(new QuickSort());
        s.sortAlgorithm.sort(a, 0, 10);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
