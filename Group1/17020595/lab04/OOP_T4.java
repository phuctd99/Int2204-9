package oop_t4;

import java.util.Arrays;

public class OOP_T4 {

    public int returnMax(int a, int b){
        if (a > b) return a;
        else return b;
    }
    public int returnMinArr(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public  String printBMI(double weight, double height){
        double BMI = weight / (height * height);
        if (BMI < 18.5){
            return "Thieu can";
        }
        else if (BMI >= 18.5 && BMI < 23){
            return "Binh thuong";
        }
        else if(BMI >= 23 && BMI < 25){
            return "Thua can";
        }
        else {
            return "Beo phi";
        }
    }
    
} 

