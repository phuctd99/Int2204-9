/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan_10;

import java.util.Random;

/**
 *
 * @author HP
 */
public class Bai_2 {
    public static void bubblesort (double []a, int length){
        int n = a.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j <n - i - 1; j++){
                if(a[j] > a[j+1]){
                    double tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i<n ; i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        try{
            int n = 1000;
            Random rd = new Random();
            double []a = new double[n];
            for(int i = 0; i < n; i++){
                a[i] = rd.nextDouble();
            }
            bubblesort(a,n);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Tran mang.");
        }
    }
}
