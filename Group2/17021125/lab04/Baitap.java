import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Baitap {
    public static int timMax (int a, int b){
        if (a > b) return a;
        else return b;
    }

    public static int minArray (int []arr, int N){
        int min = 100000000;
        for (int i = 0; i < N; i++){
            if (arr[i] <= min){
                min = arr[i];
            }
        }
        return min;
    }

    public static String BMI (double weigh, double tall ){
        double BMI = weigh / (tall*tall);
        if (BMI < 18.5){
           return "Thieu can";
        }
        else if (BMI >= 18.5 && BMI <= 22.995){
            return "Binh thuong";
        }
        else if (BMI >= 23 && BMI <= 24.99){
            return "Thua can";
        }
        else {
           return "Beo phi";
        }
    }

}
