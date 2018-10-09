/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baituan4;
import java.util.*;
/**
 *
 * @author pc
 */
public class Baituan4{

    /**
     * @param a
     * @param b
     * @param args the command line arguments
     * @return 
     */
    public static int SLN(int a, int b) { //tim so lon nhat
        if (a < b){
            return b;
        }
        else {
            return a;
        }
    }
    public static int GTNN(int[] arr) { //tim gia tri nho nhat trong mang
        Arrays.sort(arr);
        return arr[0];      
    }
    public static String BMI(double cao, double cnang) { //tinh chi so BMI
        double bmi = cnang/(cao*cao);
        String chiso = null;
        if (bmi < 18.5) {
            chiso = "Thieu can";
        }
        else if (bmi >= 18.5 && bmi < 23) {
            chiso = "Binh thuong";
        }
        else if (bmi >= 23 && bmi < 24.99) {
            chiso = "Thua can";
        }
        else {
            chiso = "Beo phi";
        }   
        return chiso;
    }
    
}