/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap10;

/**
 *
 * @author Hoang Vu Huong
 */
public class cau2 {
    public static void main(String[] args) {
        // your code goes here
        double[] arr = new double[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = Math.random() * 1000;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    double temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (double i : arr) {
            System.out.println(i);
        }

    }
}
