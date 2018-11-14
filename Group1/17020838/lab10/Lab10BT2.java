/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10bt2;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Lab10BT2 {

    /**
     * @param args the command line arguments
     */
    public static void bubbleSort(double[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if(a[j - 1] > a[j]) {
                    double tmp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = tmp;
                }
            }
        } 
    }
    public static void randArray(double[] a) {
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextDouble();
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        final int n = 1000;
        double[] a = new double[n];
        randArray(a);
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f %s", (double) a[i], " ");
        }
        System.out.println();
        bubbleSort(a);
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f %s", (double) a[i], " ");
        }
    }
    
}
