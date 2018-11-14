/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author Dell
 */
public class Lab10_2 {
    
    public static void main(String[] args) {
        double[] a = new double[1000];
        for(int i = 0; i < 1000; i++){
            a[i] = Math.random() * 1000;
        }
        for(int j = 0; j < 1000; j++){
            for(int k = 0; k < j; k++){
                if(a[k] > a[j]){
                    double x = a[k];
                    a[k] = a[j]; 
                    a[j] = x;
                }
            }
        }
        for(int m = 0; m < 1000; m ++){
            System.out.println(a[m]);
        }
    }
}
