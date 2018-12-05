package lab12bt2;

import java.util.Arrays;
class BubbleSort implements Strategy {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
public class Lab12BT2 {


    public static void main(String[] args) {
        int[] arr = {-5, 9, 12, 35, 4, 10, 5};
        Strategy strategy = new BubbleSort();
        strategy.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
