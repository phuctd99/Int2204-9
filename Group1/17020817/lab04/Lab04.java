/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;
import java.util.Arrays;

/**
 *
 * @author CCNE
 */
public class Lab04 {

    /**
     * @param args the command line arguments
     */
    public static int max (int a, int b) {
        if (a > b) return a;
        else return b;
    }
    public static int min (int[] a){
        Arrays.sort(a);
        return a[0];
    }
    public static String BMI (double kg, double m){
        double BMI = kg/(m*m);
        if (BMI < 18.5) return "Thieu can";
        else if (BMI <= 22.99) return "Binh thuong";
        else if (BMI <= 24.99) return "Thua can";
        else return "Beo phi";
    }
    
    
    
}
