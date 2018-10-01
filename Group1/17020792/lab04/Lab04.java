/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.util.Arrays;


/**
 *
 * @author phamh
 */
public class Lab04 {

    public static int max(int a, int b){
        if(a > b) return a;
        else return b;
    }
    
    public static int min(int[] a){
        Arrays.sort(a);
        return a[0];
    }
    
    public static String BMI(float h, float w){
         float bmi = w/(h*h);
        if(bmi < 18.5) return "Thiếu cân";
        else if(bmi < 23) return "Bình thường";
        else if(bmi < 24.99) return "Thừa cân";
        else return "Béo phì";
        
    }
    
   
    
}
