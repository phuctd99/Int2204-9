/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2_tuan_8;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ArrayIndexOfBoundException {
    public static void Arr(int arr[]) throws ArrayIndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        try {
            System.out.println(arr[i]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Lỗi tràn mảng");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arr(arr);
        
    }

}