/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tuan_4;
import java.util.*;
/**
 *
 * @author HP
 */
public class Bai_tuan_4{

    /**
     * @param args the command line arguments
     * @return 
     */
    static int SLN(int a, int b) {
        if (a > b){return a;}
        else {return b;}
    }
    static int GTNN(int[] arr){
        int size = arr.length;
        Arrays.sort(arr);
        return arr[0];      
    }
    static String BMI(double ccao, double cnang){
        double bmi = cnang/(ccao*ccao);
        String tmp = null;
        if (bmi < 18.5) {tmp = "Thieu can";}
        else if (bmi >= 18.5 && bmi < 23) {tmp = "Binh thuong";}
        else if (bmi >= 23 && bmi < 24.99) {tmp = "Thua can";}
        else if (bmi > 25) {tmp = "Beo phi";}   
        return tmp;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
