/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author CCNE
 */
public class lab04 {
    static int max(int x, int y){
        if (x == y) {return x;}
        if (x > y) {return x;} else {return y;}
    }

    static int nhonhat(int []arr, int n){
        int min = arr[0];
        for(int i=1; i<n; i++){
            if (arr[i]<min) 
                min = arr[i];
        }
        return min;
    }

    static String bmi(double cao, double nang){
        double BMI = nang/(cao*cao);
        if (BMI < 18.5) return  "Thiếu cân";
            else if (18.5 <= BMI && BMI <= 22.99) return "Bình thường";
                else if (22.99 <= BMI && BMI <= 24.99) return "Thừa cân";
                    else return "Béo phì";
    }
}

