/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class TestDriveMergeSort {
    public static void main(String[] args) {
        double []arr = new double[1000];
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            arr[i] = random.nextDouble() * 1000;
        }
        MergeSort.mergeSort(arr, 0, 999);
        for (int i = 0; i < 1000; i++) {
            System.out.println(arr[i]);
        }
    }
}
