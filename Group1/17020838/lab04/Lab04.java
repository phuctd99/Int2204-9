package lab04;
import java.lang.*;
import java.util.*;
import java.math.*;
public class Lab04 {
    public int max(int a,int b){
        if (a > b){
            return a;
        }
        else{
            return b;
        }
    }
    public int min(int[] a, int n){
        int tmp = a[0];
        for (int i = 1; i < n; i++){
            if(a[i] < tmp){
                tmp = a[i];
            } 
        }
        return tmp;
    }
    public String BMI(double a, double b){
        double bmi = a / (Math.pow(b, 2));
        if (bmi < 18.5){
            return "Thieu can";
        }
        else if(bmi >= 18.5 && bmi < 23){
            return "Binh thuong";
        }
        else if(bmi >= 23 && bmi <= 25){
            return "Thua can";
        }
        else {
            return "Beo phi";
        }
    }
    
}
