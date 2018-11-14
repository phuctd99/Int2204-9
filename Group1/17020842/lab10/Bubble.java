/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author CACLV
 */
public class Bubble {

    public static void main04(String[] args) {
        // your code goes here
        double[] a = new double[1000];
        for (int i = 0; i < 1000; i++) {
            a[i] = Math.random() * 1000;
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    double temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (double i : a) {
            System.out.println(i);
        }

    }
}
