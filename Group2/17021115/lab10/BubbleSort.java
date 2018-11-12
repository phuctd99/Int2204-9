package Week10;

import java.util.Random;

public class BubbleSort {

    public static void bubbleSort(double[] arr) {
        int soPhanTu = arr.length;
        for (int i = 0; i < soPhanTu - 1; i++) {
            for (int j = 0; j < soPhanTu - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Random rd = new Random();
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextDouble();
        }
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
