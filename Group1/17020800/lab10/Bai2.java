/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopw10;

/**
 *
 * @author nguyenhuy
 */
public class Bai2 {
    public double[] BubbleSort(double[] a){
        for( int i = 0; i < a.length - 1; i++){
            for(int j = a.length -1 ; j > i; j--){
                if (a[j] < a[j - 1]){
                    double k = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = k;
                }
            }
        }
        
        return a;
    }
    public static void main(String[] args) {
        double[] a = new double[10];
        for( int i = 0; i < 10 ; i++){
            a[i] = Math.random();
        }
        Bai2 abc = new Bai2();
        abc.BubbleSort(a);
        for( int i = 0; i < 10 ; i++){
            System.out.println(a[i]);;
        }
    }
}
